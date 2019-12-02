package exe36;

import java.util.Scanner;

public class Exe36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Informe a altura: ");
        double altura = sc.nextDouble();
        System.out.println("Informe o raio: ");
        double raio = sc.nextDouble();
        double v = 3.14 * Math.pow(raio, 2) * altura;
        System.out.printf("O volume do cilindro é de %.2f%n", v);
    }
    
}
