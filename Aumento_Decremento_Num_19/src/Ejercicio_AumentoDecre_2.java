import java.util.Random;
import java.util.Scanner;

public class Ejercicio_AumentoDecre_2 {
    public static void main(String[] args) {
        final var scaner = new Scanner(System.in);
        var numero = ScannerManager.leerInt(scaner, "Ingres Numero");


        scaner.close();

        //Drementamos en 1
        numero--;
        System.out.println("Numero de : " + numero);


        final var n = RandomUtilities_16.generarRandomInt(3, 10, new Random());

        
        //drecementamos en N
        numero -= n;
        System.out.println("Valor del Numero es : " + numero);

    }

}
