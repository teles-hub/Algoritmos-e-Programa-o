
import java.util.Scanner;

public class exercicio5Aula4 {

    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            System.out.println("Digite um numero inteiro: ");
            int n1 = ent.nextInt();

            if (n1 <= 100 && n1 >= 50) {
                System.out.println("Pertence ao intervalo");
            } else {
                System.out.println("Não pertence ao intervalo");
            }

        }
    }
}
