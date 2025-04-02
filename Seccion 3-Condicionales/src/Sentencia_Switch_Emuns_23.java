import java.util.Scanner;

public class Sentencia_Switch_Emuns_23 {
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);
        final var a = ScannerManager.LeerInt(scanner, "Ingrese 1er Numero: ");
        final var b = ScannerManager.LeerInt(scanner, "Ingrese 2do Numero: ");
        imprimirMenu();

        final var opcion = ScannerManager.leerChar(scanner, "Ingrese Opcion: ");
        scanner.close();

        ejecutarOpcion(a, b, opcion);

    }

    static void ejecutarOpcion(int a, int b, char opcion) {
        final var resultado = switch (opcion) {
            case 'A', 'a' -> calcularSuma(a, b);
            case 'B', 'b' -> calcularResta(a, b);
            case 'C', 'c' -> calcularMultiplicacion(a, b);
            case 'D', 'd' -> calcularDivision(a, b);
            case 'E', 'e' -> calcularResto(a, b);
            default -> -1;
        };
        if (resultado != -1) {
            System.out.printf("Resultado de los numeros (%d y %d) es: %d%n", a, b, resultado);
        } else {
            System.out.println("Opcion Incorrecta");
        }
    }

    static void imprimirMenu() {
        System.out.println("A/a Suma");
        System.out.println("B/b Resta");
        System.out.println("C/c Multiplicacion");
        System.out.println("D/d Division");
        System.out.println("E/e Resto");
    }

    static int calcularSuma(int a, int b) {
        return a + b;
    }

    static int calcularResta(int a, int b) {
        return a - b;
    }

    static int calcularMultiplicacion(int a, int b) {
        return a * b;
    }

    static int calcularDivision(int a, int b) {
        return a / b;
    }

    static int calcularResto(int a, int b) {
        return a % b;
    }
}
