import java.io.IOException;
import java.util.Scanner;

public class OMaior {
 
    public static void main(String[] args) throws IOException {        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        
        int maiorab = (a + b + Math.abs(a - b)) / 2;
        int maiorabc = (maiorab + c + Math.abs(maiorab - c)) / 2;
        
        System.out.println(maiorabc + " eh o maior");
    }
 
}