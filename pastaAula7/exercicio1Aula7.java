package exerciciosAula7;

public class exercicio1Aula7 {
    public static void main(String[] args) {
        System.out.print("[ ");
        for(int i =100; i>=0;i--){
            
            System.out.print(i+ (i !=0? "; " : " ]"));
        }
        System.out.println("");
    }
}
