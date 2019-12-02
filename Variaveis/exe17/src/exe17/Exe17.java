package exe17;

import java.util.Scanner;

public class Exe17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um comprimento em Centimétros: ");
        double c = sc.nextDouble();
        double p = c / 2.54;
        System.out.printf("O comprimento de %.2fcm transformado em Polegada é %.2f%n", c, p);
    }
    
}
