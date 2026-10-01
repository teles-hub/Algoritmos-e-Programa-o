package exerciciosAula7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio4Aula7 {
    public static void main(String[] args) {

        try (Scanner ent = new Scanner(System.in)) {

            int cont = 0;
            double mediaAltura = 0;

            DecimalFormat df = new DecimalFormat("###,###.##");

            for (int i = 1; i <= 10; i++) {

                System.out.println("Digite a idade da " + i + "ª pessoa:");
                int idade = ent.nextInt();

                System.out.println("Digite a altura da " + i + "ª pessoa:");
                double altura = ent.nextDouble();

                if (idade > 50) {
                    cont++;
                    mediaAltura += altura;
                }
            }

            if (cont > 0) {
                mediaAltura = mediaAltura / cont;
                System.out.println("A média das alturas daquelas com mais de 50 anos: "+ df.format(mediaAltura));
            } else {
                System.out.println("Nenhuma pessoa tem mais de 50 anos.");
            }
        }
    }
}
