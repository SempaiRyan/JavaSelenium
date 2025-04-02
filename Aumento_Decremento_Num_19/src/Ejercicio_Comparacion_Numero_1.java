import java.util.Random;

public class Ejercicio_Comparacion_Numero_1 {
    public static void main(String[] args) {

        final var random = new Random();
        final var a = RandomUtilities_16.generarRandomInt(20, 100, random);
        final var b = RandomUtilities_16.generarRandomInt(20, 100, random);

        impResultado(a, esNegativo(a));
        impResultado(b, esNegativo(b));

    }

    static boolean esNegativo(int numero) {
        return numero < 0;

    }

    static void impResultado(int numero, boolean esNegativo) {
        System.out.println("Numero es : " + numero);
        System.out.println("Es negativo : " + esNegativo);

    }

}
