import java.util.Scanner;

public class exercicio12Aula4 {
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)) {
            System.out.print("Digite o salário do funcionário: ");
            double salario = ent.nextDouble();
            if (salario <= 600) {
                System.out.println("Insento do inss");
            }
            else if (salario <= 1200) {
                double desconto = salario * 0.2;
                System.out.println("Desconto do inss: " + desconto);
            } else if (salario <= 2000) {
                double desconto = salario * 0.25;
                System.out.println("Desconto do inss: " + desconto);
            } else {
                double desconto = salario * 0.3;
                System.out.println("Desconto do inss: " + desconto);
            }
            // não precisa do && se não cair na malha fina de um if, ele já cai no próximo.
            //Como o INSS é progressivo, quem ganha R$ 2.500 paga 30% apenas sobre os R$ 500 que passaram de R$ 2.000, e não 30% sobre o salário todo. 
            //Em resumo esse calculo tá errado, mas como é só um exercício, não vou me aprofundar nisso.
        }
    }
}
