
import java.util.Scanner;

public class aula4 {
    public static void main(String[] args) {
       try( Scanner ent = new Scanner(System.in)){

        System.out.print("Digite um numero inteiro: " );
        int idade = ent.nextInt();
        if (idade%2==0){
            System.out.println("Par");

        }
        else{
            System.out.println("Impar");
        }

        float media = 6;
        float frequencia = 0.75f;
         
        if (media >=6 && frequencia >=0.75) {
            System.out.println("Aprovado");            
        }






        }
    }
}
