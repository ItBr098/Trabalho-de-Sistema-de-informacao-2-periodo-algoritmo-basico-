package exe21;

import java.util.Scanner;

public class Exe21 {

    public static void main(String[] args) {
        double n = 0;
        System.out.print("Informe um número: ");
        double numero = new Scanner(System.in).nextDouble();
        System.out.print("Informe outro numero: ");
        double numero2 = new Scanner(System.in).nextDouble();
        System.out.println(" ");
        System.out.println("****************************************");
        System.out.println("Menu de opções");
        System.out.println("Opção 1 = Soma dos dois números");
        System.out.println("Opção 2 = Diferença de dois números");
        System.out.println("Opção 3 = Produto de dois números");
        System.out.println("Opção 4 = Divisão de dois números");
        System.out.println("****************************************");
        int opcao = new Scanner(System.in).nextInt();
        switch(opcao){
            case 1:
                n = numero + numero2;
                System.out.println("A soma dos dois números é: "+ n);
                break;
            case 2:
                n = numero - numero2;
                System.out.println("A diferença dos dois números é: "+ n);
                break;
            case 3:
                n = numero * numero2;
                System.out.println("O produto dos dois números é: "+ n);
                break;
            case 4:
                n = numero / numero2;
                System.out.println("A divisão entre os dois números é: "+ n);
                break;
            default:
                System.out.println("Opção invalida!");
        }
    }
    
}
