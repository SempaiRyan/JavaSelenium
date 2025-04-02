import java.util.Random;

public class EjeRandom16 {
    public static void main(String[] args) {


        final var random=new Random();
        final var randomInt=RandomUtilities_16.generarRandomInt(20,100,random);
        final var randomDouble=RandomUtilities_16.generarRandomDouble(100,500,random);

        System.out.println("Random int : "+randomInt);
        System.out.println("Random Double: "+randomDouble);
    }
}
