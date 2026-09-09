
import java.util.Scanner;

public class exercicio6Aula4 {

    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            System.out.print("Digite o seu gênero (1 para masculino, 2 para feminino): ");
            int genero = ent.nextInt();

            System.out.print("Digite a sua altura em metros (ex: 1,75): ");
            // o mais comum é ser ponto, mas no meu vscode só funciona com vírgula, então vou deixar assim
            double altura = ent.nextDouble();

            if (genero == 1) {
                double pesoIdeal = (72.7 * altura) - 58;
                System.out.println("O seu peso ideal é: " + pesoIdeal + " kg");
            } else if (genero == 2) {
                double pesoIdeal = (62.1 * altura) - 44.7;
                System.out.println("O seu peso ideal é: " + pesoIdeal + " kg");
            } else {
                System.out.println("Gênero inválido. Digite 1 para masculino ou 2 para feminino.");
            }

        }
    }
}
