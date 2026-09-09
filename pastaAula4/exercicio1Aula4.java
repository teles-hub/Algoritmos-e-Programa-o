import java.util.Scanner;

public class exercicio1Aula4 {
    public static void main(String[] args) {
        try(Scanner ent = new Scanner(System.in)){

            System.out.print("Digite um numero inteiro");
            int num = ent.nextInt();
            if(num>=20){
            
            int metade = num/2;
            System.out.println("A metade do numero "+num+" é: "+metade);

            }
        }
    }
}
