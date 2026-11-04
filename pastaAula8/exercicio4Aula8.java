
import java.util.Scanner;

public class exercicio4Aula8 {

    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            while (true) {
                System.out.print("Digite um número inteiro: ");
                int num = ent.nextInt();
                boolean resultado = isPar(num);
                if (resultado) {
                    System.out.println("O número " + num + " é par.");
                } else {
                    System.out.println("O número " + num + " é ímpar.");
                }

                System.out.print("Deseja verificar outro número? (S/N): ");
                String resposta = ent.next();
                if (!resposta.equalsIgnoreCase("S")) {
                    break;
                }
            }
        }
    }

    private static boolean isPar(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
