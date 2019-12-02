package exe42;

import java.util.Scanner;

public class Exe42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu salario-base: R$");
        double salario_base = sc.nextDouble();
        double gratificação = salario_base * 5 /100;
        double imposto = salario_base * 7 /100;
        double salario = salario_base + (gratificação - imposto);
        System.out.printf("Seu salario final é de R$%.2f, com uma gratificação de 5 porcento e desconto de 7 porcento dos impostos%n", salario);
    }
    
}
