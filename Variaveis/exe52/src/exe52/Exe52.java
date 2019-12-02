package exe52;

import java.util.Scanner;

public class Exe52 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto foi o valor do prêmio: ");
        double premio = sc.nextDouble();
        System.out.println("Quanto o apostador 1 apostou: ");
        double apostador1 = sc.nextDouble();
        System.out.println("Quanto o apostador 2 apostou: ");
        double apostador2 = sc.nextDouble();
        System.out.println("Quanto o apostador 3 apostou: ");
        double apostador3 = sc.nextDouble();
        
        double aposta = apostador1 + apostador2 + apostador3;
        
        double p1 = apostador1 / aposta;
        double p2 = apostador2 / aposta;
        double p3 = apostador3 / aposta;
        
        double recebe1 = premio * p1;
        double recebe2 = premio * p2;
        double recebe3 = premio * p3;

        System.out.printf("O apostador 1 irá receber R$%.2f%n", recebe1);
        System.out.printf("O apostador 2 irá receber R$%.2f%n", recebe2);
        System.out.printf("O apostador 3 irá receber R$%.2f%n", recebe3);
    }
    
}
