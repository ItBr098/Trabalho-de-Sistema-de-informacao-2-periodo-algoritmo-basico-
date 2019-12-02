package exe34;

import java.util.Scanner;

public class Exe34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o raio do circulo: ");
        double raio = sc.nextDouble();
        double area = 3.14 * (Math.pow(raio, 2));
        System.out.printf("A area do circulo de raio %.2f é %.2f%n", raio, area);
    }
    
}
