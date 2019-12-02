package exe30;

import java.util.Scanner;

public class Exe30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto você possui em R$: ");
        double real = sc.nextDouble();
        double dolar = real / 3.9903;
        System.out.printf("Seu valor de R$%.2f em dolar é de $%.2f%n",real, dolar);
    }
    
}
