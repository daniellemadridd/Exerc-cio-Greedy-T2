import java.util.List;

public class Main {
    public static void main(String[] args) {
        int LCorrida = 100;
        int DMax = 30;
        int[] pontosApoio = {20, 40, 50, 70, 80};

        List<Integer> resultado = Algoritmo.minimizarParadas(LCorrida, DMax, pontosApoio);

        System.out.println("=".repeat(100));
        System.out.println("      RESULTADO:   ");
        System.out.println("=".repeat(40));
        if (resultado == null) {
            System.out.println("Resultado: Impossível continuar!");
        } else {
            System.out.println("Resultado: " + resultado);
        }
        System.out.println("=".repeat(100));
    }
}