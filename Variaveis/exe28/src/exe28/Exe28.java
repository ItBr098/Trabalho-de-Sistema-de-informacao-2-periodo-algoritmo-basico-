package exe28;

import java.util.Scanner;

public class Exe28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        double valor1 = sc.nextDouble();
        System.out.println("Informe outro valor: ");
        double valor2 = sc.nextDouble();
        System.out.println("Informe o último valor: ");
        double valor3 = sc.nextDouble();
        double soma_do_quadrado = ((Math.pow(valor1, 2)) + (Math.pow(valor2, 2)) + (Math.pow(valor3, 2)));
        System.out.printf("A soma do Quadrado de todos os valores é de: %.2f%n", soma_do_quadrado);
    }
    
}
