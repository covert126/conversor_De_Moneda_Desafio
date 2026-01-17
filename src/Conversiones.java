import java.util.Map;

public class Conversiones {

    public double pesoColombianoADolar(double monto, Map<String, Double> tasa){
        return monto*tasa.get("USD");
    }
    public double dolarAPesoColombiano(double monto, Map<String, Double> tasa){
        return monto*tasa.get("COP");
    }
    public double pesoArgentinoADolar(double monto, Map<String, Double> tasa){
        return monto*tasa.get("USD");
    }
    public double dolarAPesoArgentino(double monto, Map<String, Double> tasa){
        return monto*tasa.get("ARS");
    }
    public double pesoBrasilADolar(double monto, Map<String, Double> tasa){
        return monto*tasa.get("USD");
    }
    public double dolarAPesoBrazil(double monto, Map<String, Double> tasa){
        return monto*tasa.get("BRL");
    }

    public double otroTipoDePeso(double monto, Map<String, Double> tasa, String monedaDestino){
        return monto*tasa.get(monedaDestino);
    }
}
