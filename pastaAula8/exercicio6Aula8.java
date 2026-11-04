import java.util.Scanner;

public class exercicio6Aula8 {

    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            int[] vetorA = new int[5];
            int[] vetorB = new int[vetorA.length];

            System.out.println("Vetor A: ");
            preencherVetor(vetorA, ent);

            System.out.println("\nVetor B: ");
            preencherVetor(vetorB, ent);

            int maiorA = obterMaior(vetorA);
            int menorB = obterMenor(vetorB);

            System.out.println("\nO maior elemento do Vetor A é: " + maiorA);
            System.out.println("O menor elemento do Vetor B é: " + menorB);

            double mediaMaxMinA = calcularMediaMaxMin(vetorA);
            System.out.println("Média (max + min) / 2 do Vetor A: " + mediaMaxMinA);
        }
    }

    private static void preencherVetor(int[] vetor, Scanner ent) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = ent.nextInt();
        }
    }

    private static int obterMaior(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    private static int obterMenor(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    private static double calcularMediaMaxMin(int[] vetor) {
        int max = obterMaior(vetor);
        int min = obterMenor(vetor);
        return (max + min) / 2.0;
    }
}