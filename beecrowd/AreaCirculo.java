import java.io.IOException;
import java.util.Scanner;

public class AreaCirculo {
 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        double n = 3.14159;
        double raio = s.nextDouble();
        double area = n * Math.pow(raio,2);
        System.out.printf("A=%.4f\n", area);
    }

}