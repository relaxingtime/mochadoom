package config.language;

import defines.Language_t;

public interface ILanguage {

    Language_t getLanguage();

    void modifyLanguage(Language_t language);
}
