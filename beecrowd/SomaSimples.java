import java.io.IOException;
import java.util.Scanner;

public class SomaSimples {
 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int soma = a + b;
        System.out.println("SOMA = " + soma);
    }

}