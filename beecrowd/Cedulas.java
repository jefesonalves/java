import java.io.IOException;
import java.util.Scanner;

public class Cedulas {
 
    public static void main(String[] args) throws IOException {
        try (Scanner s = new Scanner(System.in)) {
            int cem = 100;
            int cinquenta = 50;
            int vinte = 20;
            int dez = 10;
            int cinco = 5;
            int dois = 2;
            int um = 1;
            
            int valor = s.nextInt();

            System.out.println(valor);
            int qtd_cem = valor / cem;
            System.out.println(qtd_cem + " nota(s) de R$ 100,00");
            int resto = valor % cem;
            
            int qtd_cinquenta = resto / cinquenta;
            System.out.println(qtd_cinquenta + " nota(s) de R$ 50,00");
            resto = resto % cinquenta;

            int qtd_vinte = resto / vinte;
            System.out.println(qtd_vinte + " nota(s) de R$ 20,00");
            resto = resto % vinte;

            int qtd_dez = resto / dez;
            System.out.println(qtd_dez + " nota(s) de R$ 10,00");
            resto = resto % dez;

            int qtd_cinco = resto / cinco;
            System.out.println(qtd_cinco + " nota(s) de R$ 5,00");
            resto = resto % cinco;

            int qtd_dois = resto / dois;
            System.out.println(qtd_dois + " nota(s) de R$ 2,00");
            resto = resto % dois;

            int qtd_um = resto / um;
            System.out.println(qtd_um + " nota(s) de R$ 1,00");
            resto = resto % um;

        }
    }
 
}