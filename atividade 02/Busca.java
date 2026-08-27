import java.util.Random;
import java.util.Arrays;

public class Busca {

    public static void main(String[] args) {
        int[] vetor1000 = new int[1000];
        int[] vetor10000 = new int[10000];
        int[] vetor100000 = new int[100000];

        preencherOrdenado(vetor1000);
        preencherOrdenado(vetor10000);
        preencherOrdenado(vetor100000);

        long inicio = System.nanoTime();

        // Para cada vetor, realizar buscas em três posições:inicio, meio e fim
        // primeiro vetor
        buscaLinear(vetor1000, vetor1000[0]);
        buscaLinear(vetor1000, vetor1000[vetor1000.length / 2]);
        buscaLinear(vetor1000, vetor1000[vetor1000.length -1]);

        buscaBinaria(vetor1000, vetor1000[0]);
        buscaBinaria(vetor1000, vetor1000[vetor1000.length / 2]);
        buscaBinaria(vetor1000, vetor1000[vetor1000.length -1]);

        // segundo vetor
        buscaLinear(vetor10000, vetor10000[0]);
        buscaLinear(vetor10000, vetor10000[vetor10000.length / 2]);
        buscaLinear(vetor10000, vetor10000[vetor10000.length -1]);

        buscaBinaria(vetor10000, vetor10000[0]);
        buscaBinaria(vetor10000, vetor10000[vetor10000.length / 2]);
        buscaBinaria(vetor10000, vetor10000[vetor10000.length -1]);

        // terceiro vetor
        buscaLinear(vetor100000, vetor100000[0]);
        buscaLinear(vetor100000, vetor100000[vetor100000.length / 2]);
        buscaLinear(vetor100000, vetor100000[vetor100000.length -1]);

        buscaBinaria(vetor100000, vetor100000[0]);
        buscaBinaria(vetor100000, vetor100000[vetor100000.length / 2]);
        buscaBinaria(vetor100000, vetor100000[vetor100000.length -1]);

        long fim = System.nanoTime();
        long duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");
    }

    public static void preencherOrdenado(int[] vetor) {
        Random aleatorio = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(1000000); 
        }
        Arrays.sort(vetor);
    }

    public static int buscaLinear(int[] vetor, int valor) {
        int comparacoes = 0; 
        for (int i = 0; i < vetor.length; i++) {
            comparacoes++;
            if (vetor[i] == valor) {
                System.out.println("Comparacoes: " + comparacoes);
                return i;
            }
        }
        System.out.println("Comparacoes: " + comparacoes);
        return -1;
    }
    
    public static int buscaBinaria(int[] vetor, int valor) {
        int comparacoes = 0;
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            comparacoes++;

            if (vetor[meio] == valor) {
                System.out.println("Comparacoes: " + comparacoes);
                return meio; 
            } else if (vetor[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        System.out.println("Comparacoes: " + comparacoes);
        return -1;
    }
}
