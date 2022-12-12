import java.io.IOException;
import java.util.Scanner;

public class BasqueteRobos {
 
    public static void main(String[] args) throws IOException {        
        try (Scanner s = new Scanner(System.in)) {            
            int distancia = s.nextInt();            
            if (distancia <= 800) {
                System.out.println("1");
            } else if (800 < distancia && distancia <= 1400) {
                System.out.println("2");
            } else if (1400 < distancia && distancia <= 2000) {
                System.out.println("3");
            } else {
                System.out.println("terminou!");
            }
        }        
    }
 
}