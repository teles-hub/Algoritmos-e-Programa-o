
import java.util.Scanner;

public class exercicio13Aula4 {

    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {

            System.out.println("Digite um numero: ");
            float n1 = ent.nextFloat();

            System.out.println("Digite um sinal (+, -, *, /): ");
            char sinal = ent.next().charAt(0);

            System.out.println("Digite um numero: ");
            float n2 = ent.nextFloat();

            if (sinal == '+') {
                System.out.println("A soma é " + (n1 + n2));
            } else if (sinal == '-') {
                System.out.println("A subtração é " + (n1 - n2));
            } else if (sinal == '*') {
                System.out.println("A multiplicação é " + (n1 * n2));
            } else if (sinal == '/') {
                if (n2 != 0) {
                    System.out.println("A divisão é " + (n1 / n2));
                } else {
                    System.out.println("Impossível dividir!!");
                }
            } else {
                System.out.println("Sinal inválido. Por favor, use apenas +, -, * ou /.");
            }
        }
    }
}
