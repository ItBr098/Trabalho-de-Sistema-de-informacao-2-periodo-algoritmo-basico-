package exe38;

import java.util.Scanner;

public class Exe38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do salario do funcionario: R$");
        double salario = sc.nextDouble();
        double acrescimo = (salario + ((salario*25) /100));
        System.out.printf("O valor final, com acrescimo, é de R$%.2f%n", acrescimo);
    }
    
}
