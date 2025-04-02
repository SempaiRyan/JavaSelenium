import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        //Declara los metodos de la tabla
        //Declarar las constantes de la tabla leyendo por teclado usando Scanner
        //Imprimir resultados

        var scaner = new Scanner(System.in);


        System.out.println("Ingrese Edad: ");
        int edad = scaner.nextInt();


        System.out.println("Ingrese Estatura :");
        var estatura = scaner.nextDouble();


        //Limpiamos el Buffer
        scaner.nextLine();

        System.out.println("Ingrese Nombres : ");
        var nombre = scaner.nextLine();


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
