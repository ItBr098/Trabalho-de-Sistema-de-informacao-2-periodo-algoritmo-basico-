package exe9;

import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius: ");
        double c = sc.nextDouble();
        double conv = c + 273.15;
        System.out.printf("A temperatura em Celsius %.2f°C convertida para kelvin é: %.2f°K%n", c, conv);
    }
    
}
