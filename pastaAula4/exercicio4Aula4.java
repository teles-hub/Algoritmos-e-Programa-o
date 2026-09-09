
import java.util.Scanner;

public class exercicio4Aula4 {
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            System.out.println("Digite um numero real: ");
            float n1 = ent.nextFloat();
            System.out.println("Digite outro numero real: ");
            float n2 = ent.nextFloat();

            if (n1<n2){
                System.out.println(n2+","+n1);
            }
            else{
                System.out.println(n1+", "+n2);

            }
        }
    }
}