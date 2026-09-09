
import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {

            System.out.println("Digite o numero de pontos do jogador 1 na fase 1. ");
            
            double pontos = ent.nextDouble();

            if (pontos >= 1000) {
                System.out.println("Parabéns você passou de fase! ");
            }
            System.out.println("Siga para proxima etapa! ");

            
        }
    }
}