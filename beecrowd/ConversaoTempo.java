import java.io.IOException;
import java.util.Scanner;

public class ConversaoTempo {
 
    public static void main(String[] args) throws IOException {
        try (Scanner s = new Scanner(System.in)) {            
            int tempo_duracao_segundos = s.nextInt();
            
            int horas = tempo_duracao_segundos / 3600;
            int minutos = (tempo_duracao_segundos - (horas * 3600)) / 60;
            int segundos = tempo_duracao_segundos % 60;
            System.out.println(horas + ":" + minutos + ":" + segundos);
            
        }
    }
 
}