/*

Método	Transforma	Ejemplo
Integer.parseInt(x)	String -> int	final var xString = "12"
final var xInteger = Integer.parseInt(xString)

Double.parseDouble(x)	String -> double	final var yString = "25.12"
final var xDouble = Double.parseDouble(yString)

Boolean.parseBoolean(x)	String -> boolean	final var yString = "TRUE"
final var xDouble = Boolean.parseBoolean(yString)


String.valueOf(x)	int -> String
double -> String	final var xInteger = 12
final var yInteger = 25.12
final var xString = String.valueOf(x)
final var yString = String.valueOf(y)
 */

public class WrapperClassConveDato_18 {
    public static void main(String[] args) {
        var precio1 = "35.50";
        var precio2 = "5.50";
        var precio3 = "50";

        final var suma = calcularSuma(precio1, precio2, precio3);
        imprimirSuma(suma);
    }

    static double calcularSuma(String pe1, String pe2, String pe3) {

        var precioDouble = Double.parseDouble(pe1);
        var precioDouble2 = Double.parseDouble(pe2);
        var precioDouble3 = Double.parseDouble(pe3);

        return precioDouble + precioDouble2 + precioDouble3;
    }

    static void imprimirSuma(double PrecioTotal) {
        System.out.printf("Precio Total : " + PrecioTotal);
    }

}
