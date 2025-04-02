import java.util.Scanner;

/*
Leer el monto del préstamo a sacar (double).

Las condiciones son las siguientes:

Si el número es par, se cobrará un 10% adicional.

Si el número es múltiplo de 3, se le suma al monto 500$.

Si el número es mayor a 500, se le suma al monto 300$.

Calcular el monto final a pagar para el banco.

Finalmente, se mostrará el resultado en la consola.
 */
public class Eje_Banco_If_Else_22 {
    public static void main(String[] args) {
        final var scaner = new Scanner(System.in);
        final var montoInicial = ScannerManager.leerDouble(scaner, "Ingrese Monto Inicial : ");
        scaner.close();
        imprimirResultado(montoInicial, calcularNumero(montoInicial));

    }

    static double calcularNumero(double montoInicial) {
        final var aumento1 = (montoInicial % 2 == 0) ? montoInicial * 0.1 : 0; //Si el número es par, se cobrará un 10% adicional.

        final var aumento2 = (montoInicial % 3 == 0) ? 500 : 0; //Si el número es múltiplo de 3, se le suma al monto 500$.

        final var aumento3 = (montoInicial > 500) ? 300 : 0;  //Si el número es mayor a 500, se le suma al monto 300$.

        return montoInicial + aumento1 + aumento2 + aumento3;
    }

    static void imprimirResultado(double montoInicial, double montoFinal) {
        System.out.printf("Para préstamo inicial %.2f se cobrará un monto final de %.2f\n : ", montoInicial, montoFinal);
    }
}
