package config.language.key;

public class EnglishKey implements ILanguageKey {

    private final static String PD_BLUEO = "You need a blue key to activate this object";
    private final static String PD_REDO = "You need a red key to activate this object";
    private final static String PD_YELLOWO = "You need a yellow key to activate this object";
    private final static String PD_BLUEK = "You need a blue key to open this door";
    private final static String PD_REDK = "You need a red key to open this door";
    private final static String PD_YELLOWK = "You need a yellow key to open this door";

    @Override
    public String getPdBlueO() {
        return PD_BLUEO;
    }

    @Override
    public String getPdRedO() {
        return PD_REDO;
    }

    @Override
    public String getPdYellowO() {
        return PD_YELLOWO;
    }

    @Override
    public String getPdBlueK() {
        return PD_BLUEK;
    }

    @Override
    public String getPdRedK() {
        return PD_REDK;
    }

    @Override
    public String getPdYellowK() {
        return PD_YELLOWK;
    }
}
