
import java.util.Scanner;

public class Exercicio11Aula3 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite o ano em que você nasceu: ");
        int anoNascimento = ent.nextInt();
        System.out.print("Digite o ano em que estamos: ");
        int ano = ent.nextInt();
        //coloquei assim para filtra os anos que pode colocar no codigo, isso evita que o usuario coloque a nos estamos em 1999 ou em 2035 por exemplo
        if (ano < 2025 || ano > 2030) {
            System.out.println("Coloque o ano atual porfavor");
        } else {
            System.out.println("Você tem " + (ano - anoNascimento) + " anos");
            System.out.println("Em 2030 você terá " + (2030 - anoNascimento));
        }
        ent.close();
    }
}
