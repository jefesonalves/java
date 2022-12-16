import java.io.IOException;
import java.util.Scanner;

public class Consumo {
 
    public static void main(String[] args) throws IOException {        
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        double y = s.nextDouble();
        
        Double consumo_medio = x / y;
        
        System.out.printf("%.3f km/l\n", consumo_medio);
    }
 
}