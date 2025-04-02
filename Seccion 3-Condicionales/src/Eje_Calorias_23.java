import java.util.Scanner;

public class Eje_Calorias_23 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var diaSemana = ScannerManager.LeerString(scanner, "Ingrese dia Semana: ");
        scanner.close();

        imprimirResultado(diaSemana, calcularCalorias(diaSemana));
    }

    static int calcularCalorias(String diaSemana) {
        return switch (diaSemana) {
            case "LUNES" -> 35;
            case "MARTES" -> 420;
            case "MIERCOLES" -> 220;
            case "JUEVES" -> 600;
            case "VIERNES" -> 125;
            case "SABADO" -> 250;
            case "DOMINGO" -> 100;
            default -> -1;
        };
    }

    static void imprimirResultado(String diaSemana, int kCal) {
        System.out.printf("Para el %s se deben quemar %d kcal.%n", diaSemana, kCal);
    }
}