import java.util.Scanner;

public class ScannerManager {
    static int LeerInt(Scanner scanner, String mensaje) {
        System.out.println("$s : " + mensaje);
        return scanner.nextInt();


    }

    static double LeerDobuel(Scanner scanner, String mensaje) {
        System.out.println("$s : " + mensaje);
        return scanner.nextDouble();

    }

    static String LeerString(Scanner scanner, String mensaje) {
        System.out.println("$s : " + mensaje);
        return scanner.nextLine();
    }

    static char LeerChar(Scanner scanner, String mensaje) {
        System.out.println("$s : " + mensaje);
        return scanner.next().charAt(0);
    }

    static boolean LeerBooleano(Scanner scanner, String mensaje) {
        System.out.println("$s : " + mensaje);
        return scanner.nextBoolean();

    }
    
}