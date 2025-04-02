public class Operacion_matematicas13 {
    public static void main(String[] args) {
        final var velocidadIni=15.24;
        final var aceleracion=3.75;
        final var tiempo=5;
        final var velocidadFinal=velocidadIni+aceleracion+tiempo; //MRUV


        System.out.println("Para la velocidad inicial: " + velocidadIni);
        System.out.printf("Para la aceleración: " + aceleracion);
        System.out.printf("Para el tiempo: " + tiempo);
        System.out.printf("Para la velocidad final: " +velocidadFinal);
    }
}
