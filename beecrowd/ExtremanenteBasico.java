import java.io.IOException;
import java.util.Scanner;

public class ExtremanenteBasico {
 
    public static void main(String[] args) throws IOException {        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int x = a + b;
        System.out.println("X = " + x);
    }
 
}