import java.io.IOException;
import java.util.Scanner;

public class GastoCombustivel {
 
    public static void main(String[] args) throws IOException {
        try (Scanner s = new Scanner(System.in)) {
            int autonomia = 12;
            double tempo_gasto = s.nextDouble();
            double velocidade_media = s.nextDouble();
            double litros = tempo_gasto * velocidade_media / autonomia;
            System.out.printf("%.3f\n", litros);
        }
    }
 
}