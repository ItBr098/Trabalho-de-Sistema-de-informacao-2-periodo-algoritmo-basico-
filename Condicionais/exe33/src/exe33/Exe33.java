package exe33;

import java.util.Scanner;

public class Exe33 {

    public static void main(String[] args) {
         double valor_final = 0;
        System.out.println("Qual o valor do produto: R$");
        double valor = new Scanner(System.in).nextInt();
        if (valor <= 50) {
            valor_final = valor + (valor * 5) / 100;
            System.out.printf("Novo valor R$%.2f%n", valor_final);
        }else if(valor > 50 && valor <= 100){
            valor_final = valor + (valor * 10) / 100;
            System.out.printf("Novo valor R$%.2f%n", valor_final);
        }else if(valor > 100){
            valor_final = valor + (valor * 15) / 100;
            System.out.printf("Novo valor R$%.2f%n", valor_final);
        }
        if(valor_final <= 80){
            System.out.println("Valor barato");
        }else if(valor_final > 80 && valor_final <= 120){
            System.out.println("Valor normal");
        }else if(valor_final > 120 && valor_final <= 200){
            System.out.println("Caro");
        }else if(valor_final > 200){
            System.out.println("Valor muito caro");
        }
    }
    
}
