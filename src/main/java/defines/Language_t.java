package defines;

/** Identify language to use, software localization. */
public enum Language_t {
    english,
    spanish,
    french,
    german,
    unknown;

    public static Language_t getLanguage(String language) throws IllegalArgumentException{
        return Language_t.valueOf(language);
    }
}

