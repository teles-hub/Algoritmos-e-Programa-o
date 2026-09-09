
import java.util.Scanner;

public class exercicio7Aula4 {

    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {

            System.out.print("Digite o seu salário: ");
            double salario = ent.nextDouble();
            System.out.print("Digite o seu tempo de serviço em anos: ");
            int tempoServico = ent.nextInt();

            if (tempoServico >= 5) {
                double bonus = salario * 0.2;
                System.out.println("O funcionário tem direito a bônus de: R$ " + bonus);
            } 
            else {
                double bonus = salario * 0.1;
                System.out.println("O funcionário tem direito a bônus de: R$ " + bonus);
            }

        }
    }
}
