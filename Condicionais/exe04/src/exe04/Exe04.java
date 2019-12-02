package exe04;

import java.util.Scanner;

public class Exe04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número ");
        double numero = sc.nextDouble();
        if(numero > 0){
            double raiz = Math.sqrt(numero);
            double quadrado = Math.pow(numero, 2);
            System.out.printf("A raiz quadrada de %.2f é %.2f%n", numero, raiz);
            System.out.printf("%.2f² é igual a %.2f%n", numero, quadrado);
        }
    }
    
}
