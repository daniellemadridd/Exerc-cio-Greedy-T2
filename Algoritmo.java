import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algoritmo {
    public static List<Integer> minimizarParadas(int L, int D, int[] pontos) {
        int[] rotas = new int[pontos.length + 2];
        rotas[0] = 0;
        System.arraycopy(pontos, 0, rotas, 1, pontos.length);
        rotas[rotas.length - 1] = L;

        Arrays.sort(rotas, 1, rotas.length - 1);

        List<Integer> paradasFeitas = new ArrayList<>();
        int posicaoAtualIdx = 0;

        for (int i = 0; i < rotas.length - 1; i++) {
            if (rotas[i + 1] - rotas[posicaoAtualIdx] > D) {
                if (i == posicaoAtualIdx) {
                    return null;
                }

                paradasFeitas.add(rotas[i]);
                posicaoAtualIdx = i;
            }
        }

        return paradasFeitas;
    }
}