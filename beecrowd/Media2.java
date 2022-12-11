import java.io.IOException;
import java.util.Scanner;

public class Media2 {
 
    public static void main(String[] args) throws IOException {        
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double media = ((a * 2) + (b * 3) + (c * 5)) / 10;
        System.out.printf("MEDIA = %.1f\n", media);
    }
 
}