import java.util.Scanner;

public class ScannerManager {
    static int LeerInt(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.nextInt();
    }

    static double leerDouble(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.nextDouble();
    }

    static String LeerString(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.nextLine();
    }

    static char leerChar(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.next().charAt(0);
    }

    static boolean LeerBoolean(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.nextBoolean();
    }
}
