package exe25;

import java.util.Scanner;

public class Exe25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor em Acres: ");
        double acres =  sc.nextDouble();
        double metros_Quadrados = acres * 4048.58;
        System.out.printf("O valor de %.2fm² convertidos para Acres é de %.2fac%n", acres, metros_Quadrados);
    }
    
}
