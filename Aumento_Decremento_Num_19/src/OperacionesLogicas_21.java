import java.util.Random;

public class OperacionesLogicas_21 {
    public static void main(String[] args) {

        final var numero = RandomUtilities_16.generarRandomInt(10, 200, new Random());


        System.out.printf("El número %d es Par y Mayor a 50: %b%n", numero, preguntaCondi1(numero));
        System.out.printf("El número %d es Múltiplo de 3 o menor a 35: %b%n", numero, preguntaCondi2(numero));

        
    }

    static boolean preguntaCondi1(int numero) {

        return (numero % 2 == 0) && (numero > 50);
    }

    static boolean preguntaCondi2(int numero) {

        return (numero % 3 == 0) || (numero <= 35);
    }

}
