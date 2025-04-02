import java.util.Scanner;

public class ScannerEjercicio17 {
    public static void main(String[] args) {
        //Declara los metodos de la tabla
        //Declarar las constantes de la tabla leyendo por teclado usando Scanner
        //Imprimir resultados

        var scaner=new Scanner(System.in);

        System.out.println("Ingrese Edad: ");
        var edad=scaner.nextInt();

        System.out.println("Ingrese Estatura :");
        var estatura=scaner.nextDouble();


        scaner.close();
        imprimirResultado(edad,estatura);
    }

    static void imprimirResultado(int edad,double estatura){
        System.out.println("Tu edad %d y tu estatura es de  %.2"+"......."+edad+"......."+estatura);
    }
}
