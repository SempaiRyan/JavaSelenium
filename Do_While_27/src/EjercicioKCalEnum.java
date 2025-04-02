import java.util.Scanner;

public class EjercicioKCalEnum {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        String diaSemana;

        do {
            diaSemana = ScannerManager.LeerString(scanner, "Ingrese el Dia Semana && Escriba SALIDA para terminar  ");
            if (!diaSemana.equals("SALIDA")) {
                imprimirResultado(diaSemana, calcularCalorias(DiaSemanas.valueOf(diaSemana)));
            }

        } while (!diaSemana.equals("SALIDA")); // Corrección: ¡Cambiar la condición para que salga correctamente!

        scanner.close();
    }

    static int calcularCalorias(DiaSemanas diaSemana) {
        return switch (diaSemana) {
            case LUNES -> 35;
            case MARTES -> 420;
            case MIERCOLES -> 220;
            case JUEVES -> 600;
            case VIERNES -> 125;
            case SABADO -> 250;
            case DOMINGO -> 100;
        };
    }

    static void imprimirResultado(String diaSemana, int kCal) {
        System.out.printf("Para el %s se deben quemar %d kcal.%n", diaSemana, kCal);
    }

    enum DiaSemanas {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }
}
