import java.util.Random;
import java.util.Scanner;

public class Condicion_If_Else_22 {
    public static void main(String[] args) {
        final var scaner = new Scanner(System.in);
        final var numeroJugador = ScannerManager.LeerInt(scaner, "Escribe un Numero uwu  del 1 al 6: ");

        scaner.close();
        if (valiNumero(numeroJugador)) {

            final var numeroAleatorio = RandomUtilities_16.generarRandomInt(1, 6, new Random());
            mostrarMensaje(numeroJugador, numeroAleatorio);
        } else {
            System.out.println("Numero INVALIDO halago de nuevo :");
        }
    }

    static boolean valiNumero(int numeroJugados) {
        return (numeroJugados >= 1) && (numeroJugados <= 6); //validado que esta entre 1 y 6
    }

    static void mostrarMensaje(int numeroJugador, int numeroAleatorio) {
        System.out.println("Primer Aletorio es :  " + numeroAleatorio);
        if (numeroJugador == numeroAleatorio) {
            System.out.println("Ganaste SIU! ");
        } else {
            System.out.println("Perdiste amigo mio PIPIPI");
        }
    }
}
