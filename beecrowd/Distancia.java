import java.io.IOException;
import java.util.Scanner;

public class Distancia {
 
    public static void main(String[] args) throws IOException {
        try (Scanner s = new Scanner(System.in)) {
            int distancia = s.nextInt();
            int tempo = 60 * distancia / 30;
            System.out.println(tempo + " minutos");
        }
    }
 
}