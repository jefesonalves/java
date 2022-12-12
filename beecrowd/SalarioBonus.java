import java.io.IOException;
import java.util.Scanner;

public class SalarioBonus {
 
    public static void main(String[] args) throws IOException {        
        try (Scanner s = new Scanner(System.in)) {
            int percentual_comissao = 15;
            String nome_vendedor = s.next();
            double salario_fixo = s.nextDouble();        
            double total_vendas = s.nextDouble();
            double comissao_receber = total_vendas * percentual_comissao / 100;
            double total_receber = salario_fixo + comissao_receber;        
            System.out.printf("TOTAL = R$ %.2f\n", total_receber);
        }        
    }
 
}