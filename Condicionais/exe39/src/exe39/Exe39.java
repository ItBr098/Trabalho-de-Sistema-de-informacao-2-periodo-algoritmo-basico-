package exe39;

import java.util.Scanner;

public class Exe39 {

    public static void main(String[] args) {
        double reajuste;
        double novo_salario = 0;
        int bonus;
        System.out.print("Informe o seu salário: R$");
        double salario = new Scanner(System.in).nextDouble();
        System.out.print("Qual seu tempo de serviço: ");
        double p = new Scanner(System.in).nextDouble();
        if(salario <= 500 && p < 1){
            bonus = 0;
            reajuste = salario + (salario * 25 /100);
            novo_salario = reajuste + bonus;
            System.out.println("Seu novo salario é: R$"+novo_salario);
        }else if(salario <= 1000 && p >= 1 && p <= 3){
            bonus = 100;
            reajuste = salario + (salario * 20 /100);
            novo_salario = reajuste + bonus;
            System.out.println("Seu novo salario é: R$"+novo_salario);
        }else if(salario <= 1500 && p >= 4 && p <= 6){
            bonus = 200;
            reajuste = salario + (salario * 15 /100);
            novo_salario = reajuste + bonus;
            System.out.println("Seu novo salario é: R$"+novo_salario);
        }else if(salario <= 2000 && p >= 7 && p <= 10){
            bonus = 300;
            reajuste = salario + (salario * 10 /100);
            novo_salario = reajuste + bonus;
            System.out.println("Seu novo salario é: R$"+novo_salario);
        }else if(salario > 2000 && p > 10){
            bonus = 500;
            reajuste = salario + (salario * 0 /100);
            novo_salario = reajuste + bonus;
            System.out.println("Seu novo salario é: R$"+novo_salario);
        }else{
            System.out.println("período inválido, sem reajuste e bônus");
        }
        
    }
    
}
