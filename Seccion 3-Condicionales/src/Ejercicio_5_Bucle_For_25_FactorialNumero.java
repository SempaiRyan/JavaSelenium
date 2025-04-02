import java.util.Random;

public class Ejercicio_5_Bucle_For_25_FactorialNumero {
    public static void main(String[] args) {
        final var n = RandomUtilities_16.generarRandomInt(2, 10, new Random());
        imprimirResultado(n, calcularFactorial(n));
    }

    /*
    Secuencia : 1,2,3..... N-1
    Filtros: Ninguno
    Acción : producto
    */

    static int calcularFactorial(int n) {

        var factorial = 1;

        for (var i = 1; i <= n; i++) { //Secuencia, n incluido
            factorial *= i; //Acumulado producto
        }

        return factorial;
    }

    static void imprimirResultado(int n, int factorial) {
        System.out.printf("El factorial de %d es: %d%n", n, factorial);
    }
}
