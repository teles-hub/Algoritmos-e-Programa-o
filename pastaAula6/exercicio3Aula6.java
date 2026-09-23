package exerciciosAula6;

import java.util.Scanner;

public class exercicio3Aula6 {
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            System.out.println("Entre com um numero maximo: ");
            int numMax = ent.nextInt();

            int sequencia = 1;
            while (sequencia <= numMax) {
                sequencia = sequencia*2;
            }
            
            System.out.println("O numero maximo dá sequencia é: "+sequencia/2);
        }
    }
}
