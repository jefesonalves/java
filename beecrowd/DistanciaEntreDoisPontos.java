import java.io.IOException;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {
 
    public static void main(String[] args) throws IOException {        
        Scanner s = new Scanner(System.in);
        Double x1 = s.nextDouble();
        Double y1 = s.nextDouble();
        Double x2 = s.nextDouble();
        Double y2 = s.nextDouble();
        
        Double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.printf("%.4f\n", distancia);
    }
 
}