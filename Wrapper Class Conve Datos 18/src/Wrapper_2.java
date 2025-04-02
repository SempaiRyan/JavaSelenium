public class Wrapper_2 {
    public static void main(String[] args) {
        var cantidad1 = "50";
        var cantidad2 = "5";
        var cantidad3 = "2";

        var suma = calcularSuma(cantidad1, cantidad2, cantidad3);
        imprimirSuma(suma);

    }

    static int calcularSuma(String canti1, String cant2, String cant3) {
        var cantidadInt1 = Integer.parseInt(canti1);
        var cantidadInt2 = Integer.parseInt(cant2);
        var cantidadInt3 = Integer.parseInt(cant3);
        return cantidadInt1 + cantidadInt2 + cantidadInt3;
    }

    static void imprimirSuma(int cantidadSuma) {
        System.out.println("La cantidad Suma es : " + cantidadSuma);
    }
}
