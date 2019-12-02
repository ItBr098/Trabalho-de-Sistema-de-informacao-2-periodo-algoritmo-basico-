package exe10;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma velocidade em Km/h: ");
        double k = sc.nextDouble();
        double m = k / 3.6;
        System.out.printf("A velocidade de %.2f Km/h convertida para m/s é %.2f m/s%n", k, m);
    }
    
}
