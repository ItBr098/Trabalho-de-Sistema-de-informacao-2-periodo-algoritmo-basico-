package exe02;

import java.util.Scanner;

public class Exe02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = sc.nextDouble();
        if(numero > 0){
            double raiz = Math.sqrt(numero);
            System.out.printf("A raiz quadrada de %.2f%n", raiz);
        }
    }
}
