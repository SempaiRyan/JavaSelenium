import java.util.Scanner;

public class EjercicioCirculo_22 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var radio = ScannerManager.leerDouble(scanner, "Ingrese Radio");
        imprimirMenu();

        var opcion = ScannerManager.leerChar(scanner, "Ingresa Opcion: ");
        scanner.close();

        if (validarInput(opcion)) {
            if (opcion == 'A') {
                mostrarArea(calcularArea(radio));
            } else if (opcion == 'B') {
                mostrarPerimetro(calcularPerimetro(radio));
            } else if (opcion == 'C') {
                mostrarArea(calcularArea(radio));
                mostrarPerimetro(calcularPerimetro(radio));
            }
        } else {
            System.out.println("Error amigo/a");
        }
    }

    static void imprimirMenu() {
        System.out.println("A : Calcular Area");
        System.out.println("B : Calcular Perimetro");
        System.out.println("C : Calcular Area y Perimetro");
    }

    static boolean validarInput(char opcion) {
        return (opcion == 'A') || (opcion == 'B') || (opcion == 'C');
    }

    static void mostrarArea(double area) {
        System.out.printf("El area es: %.2f%n", area); // Agregado el especificador de formato
    }

    static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }


    static void mostrarPerimetro(double perimetro) {
        System.out.printf("Perimetro es: %.2f%n", perimetro); // Agregado el especificador de formato
    }

    static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }
}
