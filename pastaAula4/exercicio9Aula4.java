import java.util.Scanner;

public class exercicio9Aula4 {
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            System.out.print("Digite o seu salário: ");
            double salario = ent.nextDouble();
            System.out.print("Digite o valor do empréstimo: ");
            double emprestimo = ent.nextDouble();

            double porcentagem = emprestimo / salario;

            if (porcentagem <= 0.3) {
                System.out.println("Empréstimo aprovado");
            } else {
                System.out.println("Empréstimo não pode ser concedido, pois o valor do empréstimo ultrapassa 30% do salário.");
            }

        }
    }
}
