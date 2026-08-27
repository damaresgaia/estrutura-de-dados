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

        long inicio, fim, duracaoMs;

        System.out.println("=== VETOR DE 1.000 ELEMENTOS ===");
        
        System.out.println("\n--- Busca Linear ---");
        System.out.print("Início - ");
        inicio = System.nanoTime();
        buscaLinear(vetor1000, vetor1000[0]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Meio - ");
        inicio = System.nanoTime();
        buscaLinear(vetor1000, vetor1000[(vetor1000.length - 1) / 2]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Fim - ");
        inicio = System.nanoTime();
        buscaLinear(vetor1000, vetor1000[vetor1000.length - 1]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.println("\n--- Busca Binária ---");
        System.out.print("Início - ");
        inicio = System.nanoTime();
        buscaBinaria(vetor1000, vetor1000[0]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Meio - ");
        inicio = System.nanoTime();
        buscaBinaria(vetor1000, vetor1000[(vetor1000.length - 1) / 2]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Fim - ");
        inicio = System.nanoTime();
        buscaBinaria(vetor1000, vetor1000[vetor1000.length - 1]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.println("\n--- Arrays.binarySearch ---");
        System.out.print("Início - ");
        inicio = System.nanoTime();
        Arrays.binarySearch(vetor1000, vetor1000[0]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Meio - ");
        inicio = System.nanoTime();
        Arrays.binarySearch(vetor1000, vetor1000[(vetor1000.length - 1) / 2]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Fim - ");
        inicio = System.nanoTime();
        Arrays.binarySearch(vetor1000, vetor1000[vetor1000.length - 1]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");



        System.out.println("\n=== VETOR DE 10.000 ELEMENTOS ===");
        
        System.out.println("\n--- Busca Linear ---");
        System.out.print("Início - ");
        inicio = System.nanoTime();
        buscaLinear(vetor10000, vetor10000[0]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Meio - ");
        inicio = System.nanoTime();
        buscaLinear(vetor10000, vetor10000[(vetor10000.length - 1) / 2]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Fim - ");
        inicio = System.nanoTime();
        buscaLinear(vetor10000, vetor10000[vetor10000.length - 1]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.println("\n--- Busca Binária ---");
        System.out.print("Início - ");
        inicio = System.nanoTime();
        buscaBinaria(vetor10000, vetor10000[0]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Meio - ");
        inicio = System.nanoTime();
        buscaBinaria(vetor10000, vetor10000[(vetor10000.length - 1) / 2]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Fim - ");
        inicio = System.nanoTime();
        buscaBinaria(vetor10000, vetor10000[vetor10000.length - 1]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.println("\n--- Arrays.binarySearch ---");
        System.out.print("Início - ");
        inicio = System.nanoTime();
        Arrays.binarySearch(vetor10000, vetor10000[0]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Meio - ");
        inicio = System.nanoTime();
        Arrays.binarySearch(vetor10000, vetor10000[(vetor10000.length - 1) / 2]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Fim - ");
        inicio = System.nanoTime();
        Arrays.binarySearch(vetor10000, vetor10000[vetor10000.length - 1]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");



        System.out.println("\n=== VETOR DE 100.000 ELEMENTOS ===");
        
        System.out.println("\n--- Busca Linear ---");
        System.out.print("Início - ");
        inicio = System.nanoTime();
        buscaLinear(vetor100000, vetor100000[0]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Meio - ");
        inicio = System.nanoTime();
        buscaLinear(vetor100000, vetor100000[(vetor100000.length - 1) / 2]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Fim - ");
        inicio = System.nanoTime();
        buscaLinear(vetor100000, vetor100000[vetor100000.length - 1]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.println("\n--- Busca Binária ---");
        System.out.print("Início - ");
        inicio = System.nanoTime();
        buscaBinaria(vetor100000, vetor100000[0]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Meio - ");
        inicio = System.nanoTime();
        buscaBinaria(vetor100000, vetor100000[(vetor100000.length - 1) / 2]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Fim - ");
        inicio = System.nanoTime();
        buscaBinaria(vetor100000, vetor100000[vetor100000.length - 1]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.println("\n--- Arrays.binarySearch ---");
        System.out.print("Início - ");
        inicio = System.nanoTime();
        Arrays.binarySearch(vetor100000, vetor100000[0]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Meio - ");
        inicio = System.nanoTime();
        Arrays.binarySearch(vetor100000, vetor100000[(vetor100000.length - 1) / 2]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");

        System.out.print("Fim - ");
        inicio = System.nanoTime();
        Arrays.binarySearch(vetor100000, vetor100000[vetor100000.length - 1]);
        fim = System.nanoTime();
        duracaoMs = (fim - inicio) / 1000000;
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