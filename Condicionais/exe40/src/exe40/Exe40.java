package exe40;

import java.util.Scanner;

public class Exe40 {

    public static void main(String[] args) {
        double valor_distribuidora;
        double valor_imposto;
        System.out.print("Informe o custo do véiculo: R$");
        double valor = new Scanner(System.in).nextDouble();
        if(valor <= 12000){
            valor_distribuidora = valor * 5 / 100;
            valor_imposto = 0;
            valor += valor_distribuidora + valor_imposto;
        }else if(valor > 12000 && valor <= 25000){
            valor_distribuidora = valor * 10 / 100;
            valor_imposto = valor * 15 / 100 ;
            valor += valor_distribuidora + valor_imposto;
        }else if(valor > 25000){
            valor_distribuidora = valor * 15 / 100;
            valor_imposto = valor * 20 / 100 ;
            valor += valor_distribuidora + valor_imposto;
        }
        System.out.println("O valor é R$"+valor);
    }
    
}
