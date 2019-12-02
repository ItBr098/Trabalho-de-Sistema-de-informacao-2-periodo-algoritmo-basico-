package exe37;

import java.util.Scanner;

public class Exe37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do produto: R$");
        double valor = sc.nextDouble();
        double desct = (valor - ((valor*12) /100));
        System.out.printf("O valor final, com desconto, é de R$%.2f%n",desct);
    }
    
}
