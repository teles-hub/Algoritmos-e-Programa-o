package exerciciosAula5;

import java.util.Scanner;

public class exercicio5Aula5 {
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {

            System.out.println("Qual operação você deseja? ");
            System.out.println("Media - digite (M)");
            System.out.println("Diferença do maior para o menor - digite (S)");
            System.out.println("Produto entre os numeros - digite (P)");
            System.out.println("Divisão do primeiro pelo segundo - digite (D)");
            System.out.print("Digite qual operação você dejase: ");
            String operacao = ent.nextLine();


            System.out.print("Digite o primeiro numero: ");
            double num1 = ent.nextDouble();
            System.out.print("Digite o segundo numero: ");
            double num2 = ent.nextDouble();
            switch (operacao) {
                case "M":
                    System.out.println("A media é: " + ((num1 + num2) / 2));
                    break;
                case "S":
                    if (num1 > num2) {
                        System.out.println("A diferença deles é: " + (num1 - num2));
                    } else if (num2 > num1) {
                        System.out.println("A diferença deles é: " + (num2 - num1));
                    }
                    break;
                case "P":
                    System.out.println("O produto deles é: " + (num1 * num2));
                    break;
                case "D":
                    System.out.println("Divisão do primeiro numero pelo segundo: " + (num1 / num2));
                    break;
                case "m":
                    System.out.println("A media é: " + ((num1 + num2) / 2));
                    break;
                case "s":
                    if (num1 > num2) {
                        System.out.println("A diferença deles é: " + (num1 - num2));
                    } else if (num2 > num1) {
                        System.out.println("A diferença deles é: " + (num2 - num1));
                    }
                    break;
                case "p":
                    System.out.println("O produto deles é: " + (num1 * num2));
                    break;
                case "d":
                    System.out.println("Divisão do primeiro numero pelo segundo: " + (num1 / num2));
                    break;
                default:
                    System.out.println("Você errou alguma coisa tente novamente");
                    ;
            }
        }
    }
}
