package exe32;

import java.util.Scanner;

public class Exe32 {

    public static void main(String[] args) {
        int quantidade;
        int pedido;
        double preco = 0;
        cardapio p = new cardapio();
        
        System.out.println("Deseja pedir? S/N");
        String desejo = new Scanner(System.in).next();
        if(desejo.equalsIgnoreCase("s")){
            boolean pedir = true;
            while (pedir == true){
                p.cardapio();
                System.out.println("O que deseja pedir? (Informe o código do produto) ");
                pedido = new Scanner(System.in).nextInt();
                switch(pedido){
                    case 100:
                        preco = 1.20;
                        break;
                    case 101:
                        preco = 1.30;
                        break;
                    case 102:
                        preco = 1.50;
                        break;
                    case 103:
                        preco = 1.20;
                        break;
                    case 104:
                        preco = 1.70;
                        break;
                    case 105:
                        preco = 2.20;
                        break;
                    case 106:
                        preco = 1.00;
                        break;     
                }
                System.out.println("Quantidade: ");
                quantidade = new Scanner(System.in).nextInt();
                double preco_total = (preco*quantidade);
                System.out.println("Valor Total: "+ preco_total);
                System.out.println("Deseja pedir outra coisa? S/N");
                desejo = new Scanner(System.in).next();
                if(desejo.equalsIgnoreCase("s")){
                    pedir = true;
                }else{
                    pedir = false;
                    System.out.println("Obrigado, até mais");
                }
            }
        }else{
            System.out.println("Obrigado, até mais");
        }
        
    }
    
}
