package exe19;

import java.util.Scanner;

public class Exe19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor em Litros: ");
        double l = sc.nextDouble();
        double m = l /1000;
        System.out.printf("O valor de %.2f L convertido para Metros cubicos é de %.2fm³%n", l, m);
    }
    
}
