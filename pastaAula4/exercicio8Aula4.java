
import java.util.Scanner;

public class exercicio8Aula4 {

    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            // mesmo o while não sendo necessário, eu coloquei para que o usuário possa tentar várias vezes até acertar a senha
            while (true) {
                System.out.print("Insira a senha do usuário: ");
                String senha = ent.nextLine();

                if (senha.equals("R10p5")) {
                    System.out.println("Acesso concedido");
                    break;
                } else {
                    System.out.println("Acesso negado");
                }
            }
        }
    }
}
