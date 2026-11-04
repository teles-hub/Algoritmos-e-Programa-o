
import java.util.Scanner;

public class exercicio5Aula8 {

    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            System.out.print("Digite um número de 1 a 7: ");
            int dia = ent.nextInt();
            int resultado = soma(dia);
            if (resultado != 8) {
                System.out.println("O número digitado corresponde ao dia da semana: " + resultado);
            }
        }

    }

    private static int soma(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                return 1;
            case 2:
                System.out.println("Segunda-feira");
                return 2;
            case 3:
                System.out.println("Terça-feira");
                return 3;
            case 4:
                System.out.println("Quarta-feira");
                return 4;
            case 5:
                System.out.println("Quinta-feira");
                return 5;
            case 6:
                System.out.println("Sexta-feira");
                return 6;
            case 7:
                System.out.println("Sábado");
                return 7;
            default:
                System.out.println("Dia da semana inválido");
                return 8;
        }
    }
}
