import java.io.IOException;
import java.util.Scanner;

public class Diferenca {
 
    public static void main(String[] args) throws IOException {        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int diferenca = (a * b - c * d);
        System.out.println("DIFERENCA = " + diferenca);
    }
 
}