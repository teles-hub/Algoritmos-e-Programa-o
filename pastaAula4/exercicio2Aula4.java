
import java.util.Scanner;

public class exercicio2Aula4 {
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            System.out.println("Digite a sua idade: ");
            int idade = ent.nextInt();

            if (idade >= 18) {
                System.out.println("Maior de idade.");
            } else {
                System.out.println("Menor de idade");
            }
        }
    }
}
