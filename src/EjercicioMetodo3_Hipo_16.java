import java.util.Random;

public class EjercicioMetodo3_Hipo_16 {
    public static void main(String[] args) {

        final var random =new Random();

        final var cate1=RandomUtilities_16.generarRandomDouble(10,30,random);
        final var cate2=RandomUtilities_16.generarRandomDouble(10,30,random);
        final var hipotenusa=calcularHipotenusa(cate1,cate2);
        imprimirResultado(cate1,cate2,hipotenusa);
    }
    static double calcularHipotenusa(double cate1, double cate2){
        return Math.sqrt(Math.pow(cate1,2)+Math.pow(cate2,2));
    }
    static void imprimirResultado(double cate1, double cate2,double hipotenusa){
        System.out.println("Cateto 1 : "+cate1);
        System.out.println("Cateto 2 : "+cate2);
        System.out.println("Hipotenusa: "+hipotenusa);
    }
}
