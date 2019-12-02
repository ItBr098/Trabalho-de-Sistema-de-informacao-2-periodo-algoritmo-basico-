package exe18;

import java.util.Scanner;

public class Exe18 {

    public static void main(String[] args) {
        
        int n1, n2, operac;
        
        double result = 0;

        System.out.print(" Escreva um número: ");
        
        n1 = new Scanner(System.in).nextInt();

        System.out.print(" Escreva outro número: ");

        n2 = new Scanner(System.in).nextInt();

        System.out.println("____________________________");

        System.out.println(" Entre com o número da opção abaixo: ");

        System.out.println(" 1- soma ");

        System.out.println(" 2- subitração");

        System.out.println(" 3- multiplicação ");

        System.out.println(" 4- divisão ");

        System.out.println(" 5- sair");

        System.out.println("_________________________________");

        operac = new Scanner(System.in).nextInt();

        switch (operac){
            case 1:
                result = n1+n2;
                break;
            case 2:
                result = n1-n2;
                break;
            case 3:
                result = n1*n2;
                break;
            case 4:
                result = n1/n2;
                break;
            case 5:
                 System.out.println("SAIR DO MENU, OBRIGADO");
                 break;
            default:
                System.out.println("Opção invalida");
                break;
        }
        System.out.println("__________________________________");
        System.out.println(" O resultado é " + result);
    }
    
}
