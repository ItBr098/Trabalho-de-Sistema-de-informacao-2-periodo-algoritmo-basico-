package exe16;

import java.util.Scanner;

public class Exe16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um comprimento em Polegadas: ");
        double p = sc.nextDouble();
        double c = p * 2.54;
        System.out.printf("O comprimento de %.2f Polegada transformado em centimétros é %.2f cm %n", p, c);
    }
    
}
