import java.util.Random;

public class EjeComparacion_20 {
    public static void main(String[] args) {

        final var random = new Random();
        final var a = RandomUtilities_16.generarRandomInt(20, 100, random);

        final var b = RandomUtilities_16.generarRandomInt(20, 100, random);

        imprimirResultado(a, esNegativo(a));
        imprimirResultado(b, esNegativo(b));


    }

    static boolean esNegativo(int numero) {

        return numero < 0;

    }

    static void imprimirResultado(int numero, boolean esNegativo) {


        System.out.println("Numero Negativo : " + numero + ".." + esNegativo);
    }


}
