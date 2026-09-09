import java.util.Scanner;
public class desafioAula4 {
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            // o nome não é necessário, mas é bom para deixar o programa mais amigável.
            System.out.println("Digite seu nome: ");
            String nome = ent.nextLine();
            System.out.print("Qual sua nacionalidade? ");
            String nacionalidade = ent.nextLine();
            System.out.print("Qual sua idade? ");
            int idade = ent.nextInt();
            System.out.print("Possui título de eleitor? (sim/não) ");
            String titulo = ent.next();

            if (nacionalidade.equalsIgnoreCase("brasileira") || nacionalidade.equalsIgnoreCase("brasileiro")) {
                if (idade >= 18 && titulo.equalsIgnoreCase("sim")) {
                    System.out.println("Você é obrigado a votar.");
                } else if (idade >= 16 && idade < 18 && titulo.equalsIgnoreCase("sim")) {
                    System.out.println("Você é obrigado a votar.");
                }
            }
            else if (nacionalidade.equalsIgnoreCase("brasileira") && idade >= 70 && titulo.equalsIgnoreCase("sim")) {
                System.out.println("Você é obrigado a votar.");
            }
            else {
                System.out.println("Você não está apto para votar.");
            }
            // esse deu um trabalho legal, passa mais umas assim dps
        }
    }
}
