import java.util.Random;

public class codigoAletorio_14 {
    public static void main(String[] args) {
        final var min=20;
        final var max=100;
        final var random=new Random();
        final var cate1=(max-min)*random.nextDouble()+min;
        final var cate2=(max-min)*random.nextDouble()+min;
        final var hipo=Math.sqrt(Math.pow(cate1,2)+Math.pow(cate2,2));
        System.out.println("Para los catetos %.3f y %.3f tenemos una Hipotenusa de %.3fn% "+cate1+" ----- "+cate2+"-----------"+hipo);

    }
}
