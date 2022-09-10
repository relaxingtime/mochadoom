package config;

import defines.Language_t;

/**
 * Default Language English
 */
public class LanguageResolver{

    private static Language_t language = Language_t.english;


    public static Language_t getLanguage() {
        return language;
    }

    public static void modifyLanguage(Language_t language) {
        LanguageResolver.language = language;
    }

    public static boolean tryConfigureLanguageByString(String sLanguage){
        try{
            language = Language_t.getLanguage(sLanguage);
            System.out.println("Language "+ sLanguage + " detected if gamemode allows it... it will be used.");
            return true;
        }catch (IllegalArgumentException ex){
            language = Language_t.english;
            System.out.println("Couldn't configure language: "+ sLanguage + " default english would be used instead.");
            return false;
        }
    }
}
