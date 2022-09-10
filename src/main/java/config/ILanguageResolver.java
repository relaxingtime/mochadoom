package config;

import defines.Language_t;

public interface ILanguageResolver {

    Language_t getLanguage();

    void modifyLanguage(Language_t language);
}
