package config;

import config.language.key.EnglishKey;
import config.language.key.ILanguageKey;
import config.language.key.SpanishKey;
import config.language.level.EnglishLevel;
import config.language.level.ILanguageLevel;
import defines.Language_t;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * TODO: Get Rip of so much static methods and references.
 * Default Language English
 */
public class LanguageResolver{

    private static Language_t language = Language_t.english;
    private static ILanguageLevel levelsLanguage;
    private static ILanguageKey keysLanguage;

    private static final Map<Language_t, ILanguageKey> languageKeyNeededMsg = new HashMap<>();
    //Too much memory?
    private static final Map<Language_t, ILanguageLevel> languageLevelMap = new HashMap<>();

    static{
        fillLanguageMap();
        fillLanguageKey();
    }

    private static void fillLanguageKey() {
        languageKeyNeededMsg.put(Language_t.english, new EnglishKey());
        languageKeyNeededMsg.put(Language_t.spanish, new SpanishKey());
    }

    private static void fillLanguageMap() {
        languageLevelMap.put(Language_t.english, new EnglishLevel());
        languageLevelMap.put(Language_t.spanish, new EnglishLevel());
    }

    public static Language_t getLanguage() {
        return language;
    }

    /**
     * @return ILanguageLevel
     */
    public static ILanguageLevel getLanguageLevel(){
        return levelsLanguage;
    }

    /**
     * Removing this static method seems dificult...
     * See ActionsDoors Interface...
     * @return
     */
    public static ILanguageKey getLanguageKeys(){
        return keysLanguage;
    }

    /**
     * Future feature to change languages on the fly
     * @param language
     */
    public static void modifyLanguage(Language_t language) {
        LanguageResolver.language = language;
    }

    /**
     *
     * Optional went to default english with the purpose of safe game Run
     * if localization is incomplete.
     *
     * @param sLanguage
     * @return
     */
    public static boolean tryConfigureLanguageByString(String sLanguage){
        try{
            language = Language_t.getLanguage(sLanguage);
            System.out.println("Language "+ sLanguage + " detected if gamemode allows it... it will be used.");

            levelsLanguage = Optional.ofNullable(languageLevelMap.get(language))
                    .orElseGet(() -> languageLevelMap.get(Language_t.english));

            keysLanguage = Optional.ofNullable(languageKeyNeededMsg.get(language))
                    .orElseGet(() -> languageKeyNeededMsg.get(Language_t.english));

            return true;
        }catch (IllegalArgumentException ex){
            language = Language_t.english;
            System.out.println("Couldn't configure language: "+ sLanguage + " default english would be used instead.");
            return false;
        }
    }
}
