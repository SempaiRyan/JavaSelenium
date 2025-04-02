import java.util.Scanner;

public class EjercicioCalculadora {
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);
        final var a = ScannerManager.leerInt(scanner, "Ingrese 1er Numero: ");
        final var b = ScannerManager.leerInt(scanner, "Ingrese 2do Numero: ");

        char opcion;
        do {
            imprimirMenu();
            opcion = ScannerManager.leerChar(scanner, "Ingrese Opcion: ");

            if (opcion != 'F' && opcion != 'f') { //Sino es la opcion de salida
                ejecutarOpcion(a, b, opcion);

            }
        } while (opcion != 'F' && opcion != 'f'); //Condicion de continuacion


        scanner.close();
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
        System.out.println("F/f Salir del programa");

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
