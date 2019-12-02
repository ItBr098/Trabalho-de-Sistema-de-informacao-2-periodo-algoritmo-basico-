
package exe24;

import java.util.Scanner;

public class Exe24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor em m²: ");
        double metros_Quadrados =  sc.nextDouble();
        double acres = metros_Quadrados * 0.000247;
        System.out.printf("O valor de %.2fm² convertidos para Acres é de %.2fac%n", metros_Quadrados, acres);
    }
    
}
