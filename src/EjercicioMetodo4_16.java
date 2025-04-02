import java.util.Random;

public class EjercicioMetodo4_16 {
    public static void main(String[] args) {
        final var random = new Random();
        final var radio = RandomUtilities_16.generarRandomDouble(10, 25, random);
        final var area = calcularArea(radio);
        final var perimetro = calcularPerimetro(radio);
        imprimirResultado(radio, area, perimetro);
    }

    static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    static void imprimirResultado(double radio, double area, double perimetro) {
        System.out.println("Radio de: " + radio);
        System.out.println("Área de: " + area);
        System.out.println("Perímetro de: " + perimetro);
    }
}
