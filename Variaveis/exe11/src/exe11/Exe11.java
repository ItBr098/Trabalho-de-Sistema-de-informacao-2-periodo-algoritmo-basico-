package exe11;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma velocidade em m/s: ");
        double m = sc.nextDouble();
        double k = m * 3.6;
        System.out.printf("A velocidade de %.2f Km/h convertida para m/s é %.2f m/s%n", m, k);
    }
    
}
