package config.language.key;

public class SpanishKey implements ILanguageKey {

    private final static String PD_BLUEO = "Necesitas una llave azul para activar este objeto";
    private final static String PD_REDO = "Necesitas una llave roja para activar este objeto";
    private final static String PD_YELLOWO = "Necesitas una llave amarilla para activar este objeto";
    private final static String PD_BLUEK = "Necesitas una llave azul para abrir esta puerta";
    private final static String PD_REDK = "Necesitas una llave roja para abrir esta puerta";
    private final static String PD_YELLOWK = "Necesitas una llave amarilla para abrir esta puerta";

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
