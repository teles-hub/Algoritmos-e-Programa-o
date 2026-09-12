
import java.util.Scanner;

public class desafioAula4 {

    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {

            // o nome não é necessario mais eu achei legal colocar para deixar o programa mais interativo, e para que o usuário se sinta mais a vontade.
            System.out.print("Digite seu nome: ");
            String nome = ent.nextLine();

            System.out.print("Qual sua nacionalidade? ");
            String nacionalidade = ent.nextLine();

            System.out.print("Qual sua idade? ");
            int idade = ent.nextInt();

            System.out.print("Possui título de eleitor? (sim/não) ");
            String titulo = ent.next();

            boolean brasileiro = nacionalidade.equalsIgnoreCase("brasileira") || nacionalidade.equalsIgnoreCase("brasileiro");
            boolean temTitulo = titulo.equalsIgnoreCase("sim");

            if (brasileiro && temTitulo) {
                if (idade >= 18 && idade < 70) {
                    System.out.println("Você é obrigado a votar.");
                } else if (idade >= 16 && idade < 18) {
                    System.out.println("Você já pode votar (voto facultativo).");
                } else if (idade >= 70) {
                    System.out.println("Você não é obrigado a votar (voto facultativo).");
                } else {
                    System.out.println("Menor de 16 anos não pode votar, mesmo que ja tenha o título.");
                }
            } else {
                System.out.println("Você não está apto para votar.");
            }
        }
    }
}
