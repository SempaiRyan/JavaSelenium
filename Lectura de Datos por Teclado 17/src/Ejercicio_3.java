import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        //Declara los metodos de la tabla
        //Declarar las constantes de la tabla leyendo por teclado usando Scanner
        //Imprimir resultados

        var scaner = new Scanner(System.in);


        int edad = ScannerManager.LeerInt(scaner, "Ingrese Edad : ");
        double estatura = ScannerManager.LeerDobuel(scaner, "Ingrese Estatura  : ");


        //Limpiamos el Buffer
        scaner.nextLine();

        String nombre = ScannerManager.LeerString(scaner, "Ingrese Nombre : ");


        //Cierra el objeto Scanner
        scaner.close();

        //Lamamos al metodo estatico con sus variables inicializadas
        imprimirResultado(nombre, edad, estatura);

    }

    static void imprimirResultado(String nombre, int edad, double estatura) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);

    }
}
