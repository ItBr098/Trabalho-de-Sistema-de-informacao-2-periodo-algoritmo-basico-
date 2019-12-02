package exe14;

import java.util.Scanner;

public class Exe14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor em Graus: ");
        double g = sc.nextDouble();
        double r = g * 3.14/180;
        System.out.printf("O valor de %.2f° em radios é de %.2f%n", g, r);
    }
    
}
