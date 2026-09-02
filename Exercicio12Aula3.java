
import java.util.Scanner;

public class Exercicio12Aula3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Insira um número: ");
        float n1 = ent.nextFloat();
        System.out.println("O número "+n1+" elevado ao quadrado é: "+(n1*n1));
        System.out.println("O número "+n1+" elevado ao cubo é: "+(n1*n1*n1));
        System.out.println("A raiz quadrada do número "+n1+" é: "+Math.sqrt(n1));
        System.out.println("O número "+n1+" elevado a decima potência é: "+Math.pow(n1, 10));
        ent.close();
    }
}
