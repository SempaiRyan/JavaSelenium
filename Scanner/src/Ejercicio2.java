import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var scanner=new Scanner(System.in);

        final var edad=ScannerManager.leerInt(scanner,"Ingrese edad : ");

        final var estatura=ScannerManager.leerDouble(scanner,"Ingrese estatura : ");

        scanner.nextLine();
        final var nombre=ScannerManager.LeerString(scanner,"Ingrese Nombres : ");


        scanner.close();
        imprimirResultado(nombre,edad,estatura);

    }
    static void imprimirResultado(String nombre,double edad, double estatura){
        System.out.print("Nombres : "+nombre+".." + "Tu edad es : "+edad+"...."+"Tu estatura es : "+estatura);

    }
}

