/*import java.util.Random;

public class EjercicioMetodo2_16 {
    public static void main(String[] args) {
        final var random=new Random();

        final var velocidadInicial=RandomUtilities_16.generarRandomDouble(10,30,random);
        final var aceleracion=RandomUtilities_16.generarRandomDouble(2,5,random);
        final var tiempo=RandomUtilities_16.generarRandomDouble(3,5,random);


        final var velocidadFinal=calcularVelocidadFinal(calcularVelocidadFinal(velocidadInicial+aceleracion+tiempo));
        imprimirResultado(velocidadInicial+aceleracion+velocidadFinal);


    }
    static double calcularVelocidadFinal(double veloIni,double acele,int tiem){
        return veloIni+acele*tiem;
    }
    static void imprimirResultado(double veloIni,double acele,int tiem, double veloFinal){
        System.out.println("Velocidad Inicial : "+veloIni);
        System.out.println("Aceleracion es: "+acele);
        System.out.println("Tiempo es : "+tiem);
        System.out.println("Velocidad final : "+veloFinal);
    }
}

import java.util.Random;

public class EjercicioMetodo2_16 {
    public static void main(String[] args) {
        final var random = new Random();

        final var velocidadInicial = RandomUtilities_16.generarRandomDouble(10, 30, random);
        final var aceleracion = RandomUtilities_16.generarRandomDouble(2, 5, random);
        final var tiempo = RandomUtilities_16.generarRandomDouble(3, 5, random);

        final var velocidadFinal = calcularVelocidadFinal(velocidadInicial, aceleracion,tiempo);
        imprimirResultado(velocidadInicial, aceleracion, tiempo, velocidadFinal);
    }

    static double calcularVelocidadFinal(double veloIni, double acele, int tiem) {
        return veloIni + acele * tiem;
    }

    static void imprimirResultado(double veloIni, double acele, int tiem, double veloFinal) {
        System.out.println("Velocidad Inicial: " + veloIni);
        System.out.println("Aceleración: " + acele);
        System.out.println("Tiempo: " + tiem);
        System.out.println("Velocidad Final: " + veloFinal);
    }
}
*/

import java.util.Random;

public class EjercicioMetodo2_16 {
    public static void main(String[] args) {
        final var random = new Random();

        final var velocidadInicial = RandomUtilities_16.generarRandomDouble(10, 30, random);
        final var aceleracion = RandomUtilities_16.generarRandomDouble(2, 5, random);
        final var tiempo = (int) RandomUtilities_16.generarRandomDouble(3, 5, random); // Convertir a int

        final var velocidadFinal = calcularVelocidadFinal(velocidadInicial, aceleracion, tiempo);
        imprimirResultado(velocidadInicial, aceleracion, tiempo, velocidadFinal);
    }

    static double calcularVelocidadFinal(double veloIni, double acele, int tiem) {
        return veloIni + acele * tiem;
    }

    static void imprimirResultado(double veloIni, double acele, int tiem, double veloFinal) {
        System.out.println("Velocidad Inicial: " + veloIni);
        System.out.println("Aceleración: " + acele);
        System.out.println("Tiempo: " + tiem);
        System.out.println("Velocidad Final: " + veloFinal);
    }
}
