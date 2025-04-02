import java.util.Random;
import java.util.Scanner;

public class AumentoDecremento19 {
    public static void main(String[] args) {
        final var scaner = new Scanner(System.in);

        var numero = ScannerManager.leerInt(scaner, "Ingres Numero : ");

        scaner.close();

        numero++;

        System.out.println("Numero es : " + numero);

        final var n = RandomUtilities_16.generarRandomInt(3, 10, new Random());


    }

    
}
