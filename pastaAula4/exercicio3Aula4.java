
import java.util.Scanner;

public class exercicio3Aula4 {

    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            System.out.println("Digite um numero inteiro: ");
            int n1 = ent.nextInt();
            System.out.println("Digite outro numero inteiro: ");
            int n2 = ent.nextInt();

            if (n1 == n2) {
                System.out.println("Os numeros são iguais ");
            } else if (n1 > n2) {
                System.out.println("A diferença do " + n2 + " para o " + n1 + " é de: " + (n1 - n2));
            } else if (n1 < n2) {
                System.out.println("A diferença do " + n1 + " para o " + n2 + " é de: " + (n2 - n1));
              }
        }
    }
}
