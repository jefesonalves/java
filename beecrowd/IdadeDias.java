import java.io.IOException;
import java.util.Scanner;

public class IdadeDias {
 
    public static void main(String[] args) throws IOException {
        try (Scanner s = new Scanner(System.in)) {            
            int idade = s.nextInt();
            
            int ano = idade / 365;
            int mes = (idade - ano * 365) / 30;
            int dia = idade - ano * 365 - mes * 30;
            System.out.println(ano + " ano(s)");
            System.out.println(mes + " mes(es)");
            System.out.println(dia + " dia(s)");            
        }
    }
 
}