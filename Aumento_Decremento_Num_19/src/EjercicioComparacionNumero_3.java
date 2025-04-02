import java.util.Scanner;

public class EjercicioComparacionNumero_3 {
    public static void main(String[] args) {

        final var scaner = new Scanner(System.in);

        final var numLeido = (ScannerManager.leerInt(scaner, "Ingrese Num : "));

        scaner.close();
        imprResultado(numLeido, esPar(numLeido), esMutiplo(numLeido));
    }

    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }


    static boolean esMutiplo(int numero) {
        return numero % 5 == 0;
    }

    static void imprResultado(int numero, boolean esPar, boolean esMutiplo) {

        System.out.println("Numero es : " + numero);
        System.out.println("Es Par ? : " + esPar);
        System.out.println("Es num %d es multiplo de 5 :" + numero + ".." + esMutiplo);
    }
}
