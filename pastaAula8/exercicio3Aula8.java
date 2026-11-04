import java.util.Scanner;
public class exercicio3Aula8 {
    public static void main(String[] args) {
        try(Scanner ent = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            int num1 = ent.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = ent.nextInt();
            encontraMax(num1, num2);
        }
    }
    private static void encontraMax(int num1,int num2) {
        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else {
            System.out.println("O maior número é: " + num2);
        }
    }
}
