package exe41;

import java.util.Scanner;

public class Exe41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor da hora: R$");
        double valor_hora = sc.nextDouble();
        System.out.println("Informe o quantas horas foram trabalhadas: ");
        double horas_trabalhadas = sc.nextDouble();
        double salario = horas_trabalhadas * valor_hora;
        double total = salario + (salario*10) / 100;
        System.out.printf("Seu salario é de R$%.2f%n", total);
    }
    
}
