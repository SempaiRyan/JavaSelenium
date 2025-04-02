import java.util.Random;

public class EjercicioMetodo1_Ley_16 {
    public static void main(String[] args) {
        final var random = new Random();
        final var masa=RandomUtilities_16.generarRandomDouble(100,300,random);
        final var acele=RandomUtilities_16.generarRandomDouble(3,5,random);
        final var fuerza=calcularFuerza(masa,acele);
        imprimirResultado(masa,acele,fuerza);
    }

    static double calcularFuerza(double masa, double acele){
        return masa*acele;
    }
    static void imprimirResultado(double masa, double acele, double fuerza){
        System.out.println("Masa es : "+masa);
        System.out.println("Aceleracion : "+acele);
        System.out.println("Fuerza es : "+fuerza);
    }
}
