import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {
 
    public static void main(String[] args) throws IOException {        
        try (Scanner s = new Scanner(System.in)) {
            int cod_peca1 = s.nextInt();
            int num_pecas1 = s.nextInt();
            double valor_unit_peca1 = s.nextDouble();
            int cod_peca2 = s.nextInt();
            int num_pecas2 = s.nextInt();
            double valor_unit_peca2 = s.nextDouble();
            double valor_total = num_pecas1 * valor_unit_peca1 + num_pecas2 * valor_unit_peca2;
            System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor_total);
        }        
    }
 
}