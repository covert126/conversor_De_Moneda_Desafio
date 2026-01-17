import java.util.Scanner;

public class Principal {
public static void main(String[] args) {

    boolean salir = false;
    double monto;
    double resultado;
    Cambios consulta;
    Divisas divisas;
    Conversiones conversion;

    while (!salir){
        System.out.println("******************************");
        System.out.println("selecciona una de las siguientes opciones \n" +
                "1. Peso Colombiano a Dolar \n" +
                "2. Dolar a peso Colombiano \n" +
                "3. Peso Argentino a Dolar \n" +
                "4. Dolar a Peso Argentino \n" +
                "5. Peso brasil a Dolar \n" +
                "6. Dolar a Peso brasil \n" +
                "7. Salir \n" +
                "8. De un tipo de moneda a otro mas especifico \n" +
                "******************************" );

        Scanner Opcion = new Scanner(System.in);
        int uso = Opcion.nextInt();


        switch (uso){
            case 1:
                System.out.println("Ingrese el monto en COP:");
                 monto = Opcion.nextDouble();

                 consulta = new Cambios();
                 divisas = consulta.cambioDivisa("COP");

                 conversion = new Conversiones();
                 resultado = conversion.pesoColombianoADolar(
                        monto,
                        divisas.conversion_rates()
                );

                System.out.printf("Resultado en USD: %.6f%n ", resultado);
                break;

            case 2:
                System.out.println("Ingrese el monto en USD:");
                 monto = Opcion.nextDouble();

                 consulta = new Cambios();
                 divisas = consulta.cambioDivisa("USD");

                 conversion = new Conversiones();
                 resultado = conversion.dolarAPesoColombiano(
                        monto,
                        divisas.conversion_rates()
                );

                System.out.printf("Resultado en Peso Colombiano: %.2f%n ", resultado);
                break;

                case 3:
                System.out.println("Ingrese el monto en ARS:");
                monto = Opcion.nextDouble();

                consulta = new Cambios();
                divisas = consulta.cambioDivisa("ARS");

                conversion = new Conversiones();
                resultado = conversion.pesoArgentinoADolar(
                        monto,
                        divisas.conversion_rates()
                );

                System.out.printf("Resultado en USD: %.6f%n ", resultado);;
                break;

            case 4:
                System.out.println("Ingrese el monto en USD:");
                monto = Opcion.nextDouble();

                consulta = new Cambios();
                divisas = consulta.cambioDivisa("USD");

                conversion = new Conversiones();
                resultado = conversion.dolarAPesoArgentino(
                        monto,
                        divisas.conversion_rates()
                );

                System.out.printf("Resultado en Peso Argentino: %.2f%n ", resultado);
                break;
            case 5:
                System.out.println("Ingrese el monto en BRL:");
                monto = Opcion.nextDouble();

                consulta = new Cambios();
                divisas = consulta.cambioDivisa("BRL");

                conversion = new Conversiones();
                resultado = conversion.pesoBrasilADolar(
                        monto,
                        divisas.conversion_rates()
                );

                System.out.printf("Resultado en USD: %.6f%n ", resultado);
                break;

            case 6:
                System.out.println("Ingrese el monto en USD:");
                monto = Opcion.nextDouble();

                consulta = new Cambios();
                divisas = consulta.cambioDivisa("USD");

                conversion = new Conversiones();
                resultado = conversion.dolarAPesoBrazil(
                        monto,
                        divisas.conversion_rates()
                );

                System.out.printf("Resultado en Peso Brasilenio: %.2f%n ", resultado);
                break;
            case 7:
                salir = true;
                break;

            case 8:
                System.out.println("que tipo de moneda va a ingresar");
                String mon = Opcion.next().toUpperCase();

                System.out.println("a que tipo de moneda la desea pasar");
                String mon2= Opcion.next().toUpperCase();

                System.out.println("Ingrese el monto en :"+mon );
                monto = Opcion.nextDouble();

                consulta = new Cambios();
                divisas = consulta.cambioDivisa(mon);

                conversion = new Conversiones();
                resultado = conversion.otroTipoDePeso(
                        monto,
                        divisas.conversion_rates(),
                        mon2
                );

                System.out.printf("Resultado en %s: %.6f%n", mon2, resultado);

                break;
        }

    }



}
}
