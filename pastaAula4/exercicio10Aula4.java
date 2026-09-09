
import java.util.Scanner;

public class exercicio10Aula4 {

    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número inteiro:");
            int num1 = ent.nextInt();
            System.out.println("Digite o segundo número inteiro:");
            int num2 = ent.nextInt();
            System.out.println("Digite o terceiro número inteiro:");
            int num3 = ent.nextInt();

            if  (num1 == num2 && num2 == num3) {
                System.out.println("Os números são iguais.");
            } 
             else {
                // ele vê se o num1 é maior que o num2, depois ele checa se o resultado é maior que o num3, ai ele retorna o maior deles.
                int maior = Math.max(Math.max(num1, num2), num3);
                System.out.println("O maior número é: " + maior);
            }

        }
    }
}
