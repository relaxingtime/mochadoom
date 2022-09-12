package config.language.key;

public class SpanishKey implements ILanguageKey {

    private final static String PD_BLUEO = "Llave azul necesaria para activar este objeto";
    private final static String PD_REDO = "Llave roja necesaria para activar este objeto";
    private final static String PD_YELLOWO = "Llave amarilla necesaria para activar este objeto";
    private final static String PD_BLUEK = "Llave azul necesaria para abrir esta puerta";
    private final static String PD_REDK = "Llave roja necesaria para abrir esta puerta";
    private final static String PD_YELLOWK = "Llave amarilla necesaria para abrir esta puerta";

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
