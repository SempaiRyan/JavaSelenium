import java.util.Scanner;

public class LecturaDatos_Scaner_17 {
    public static void main(String[] args) {
        final var scanner=new Scanner(System.in);

        System.out.println("Nombres: ");
        final var nombre=scanner.nextLine();

        System.out.println("Ingrese edad: ");
        final var edad=scanner.nextInt();

        System.out.println("Ingrese estatura: ");
        final var estatura=scanner.nextInt();

        scanner.close();
        imprimirResultado(nombre,edad,estatura);

    }
    static void imprimirResultado(String nombre,double edad, double estatura){
        System.out.println("Nombres : "+nombre);
        System.out.println("Edad es : "+edad);
        System.out.println("Estatura es : "+estatura);
    }
}
