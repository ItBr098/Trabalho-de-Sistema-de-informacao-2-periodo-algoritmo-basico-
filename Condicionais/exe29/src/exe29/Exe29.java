package exe29;

import java.util.Random;
import java.util.Scanner;

public class Exe29 {

    public static void main(String[] args) {
        int acertou = 0;
        Random g = new Random();
        Random h = new Random();
        for(int i = 1; i <= 5;){
            int a = g.nextInt(100);
            int b = h.nextInt(100);
            if( a > 0 && a <= 100 && b > 0 && b <= 100){
                System.out.printf("Qual a soma de: %d + %d: ", a, b);
                int valor = new Scanner(System.in).nextInt();
                int soma = a + b;
                if(valor == soma){
                    acertou += 1;
                    System.out.println("Você acertou!");
                    System.out.println("");
                    i++;
                }else{
                    System.out.println("A resposta coreta é " + soma);
                    System.out.println("Você errou");
                    System.out.println("");
                    i++;
                }
            }
        }
        System.out.printf("Você acertou %d!%n", acertou);
    }
}