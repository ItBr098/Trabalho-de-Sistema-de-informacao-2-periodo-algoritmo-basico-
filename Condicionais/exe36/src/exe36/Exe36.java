package exe36;

import java.util.Scanner;

public class Exe36 {

    public static void main(String[] args) {
        double comicao = 0;
        System.out.print("Informe o valor da venda: R$");
        double valor_venda = new Scanner(System.in).nextInt();
        if(valor_venda >= 100000){
            comicao = 700 + ((valor_venda * 16) / 100);
        }else if(valor_venda < 100000 && valor_venda >= 80000){
            comicao = 650 + ((valor_venda * 14) / 100);
        }else if(valor_venda < 80000 && valor_venda >= 60000){
            comicao = 600 + ((valor_venda * 14) / 100);
        }else if(valor_venda < 60000 && valor_venda >= 40000){
            comicao = 550 + ((valor_venda * 14) / 100);
        }else if(valor_venda < 40000 && valor_venda >= 20000){
            comicao = 500 + ((valor_venda * 14) / 100);
        }else if(valor_venda < 20000){
            comicao = 400 + ((valor_venda * 14) / 100);
        }
        System.out.println("Sua comição é de: R$"+comicao);
    }
    
}
