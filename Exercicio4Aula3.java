import java.util.Scanner;

public class Exercicio4Aula3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Insira o primeiro numero: ");
        int n1 = ent.nextInt();

        System.out.print("Insira o segundo numero: ");
        int n2 = ent.nextInt();
        
        System.out.print("Insira o terceiro numero: ");
        int n3 = ent.nextInt();
        
        System.out.print("Insira o quarto numero: ");
        int n4 = ent.nextInt();
        
        System.out.println("A soma dos numeros é: " + (n1 + n2 + n3 + n4));
        ent.close();
    }
}
//Cauê Teles Rodrigues da Silva
