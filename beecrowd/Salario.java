import java.io.IOException;
import java.util.Scanner;

public class Salario {
 
    public static void main(String[] args) throws IOException {        
        Scanner s = new Scanner(System.in);
        int numero_funcionario = s.nextInt();
        int horas_trabalhadas = s.nextInt();
        double valor_hora = s.nextDouble();
        double salario = horas_trabalhadas * valor_hora;
        System.out.println("NUMBER = "+ numero_funcionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);        
    }
 
}