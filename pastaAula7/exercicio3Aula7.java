package exerciciosAula7;

import java.util.Scanner;

public class exercicio3Aula7 {
    public static void main(String[] args) {
        try(Scanner ent = new Scanner(System.in)){
            System.out.println("Digite o numero maximo: ");
            int maximo = ent.nextInt();
            for (int i = 1; i<=maximo; i++ ) {
                System.out.print(i+(i !=maximo? "; " : "."));
            }
        }
    }
}
