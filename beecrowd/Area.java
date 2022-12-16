import java.io.IOException;
import java.util.Scanner;

public class Area {
 
    public static void main(String[] args) throws IOException {        
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double pi = 3.14159;

        double area_triangulo = a * c / 2;
        double area_circulo = pi * Math.pow(c,2);
        double area_trapezio = (a + b) * c / 2;
        double area_quadrado = Math.pow(b,2);
        double area_retangulo = a * b;
        double media = ((a * 3.5) + (b * 7.5)) / 11;
        System.out.printf("TRIANGULO: %.3f\n", area_triangulo);
        System.out.printf("CIRCULO: %.3f\n", area_circulo);
        System.out.printf("TRAPEZIO: %.3f\n", area_trapezio);
        System.out.printf("QUADRADO: %.3f\n", area_quadrado);
        System.out.printf("RETANGULO: %.3f\n", area_retangulo);
    }
 
}