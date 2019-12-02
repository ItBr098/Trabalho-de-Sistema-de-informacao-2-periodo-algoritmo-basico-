package exe40;

import java.util.Scanner;

public class Exe40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaria = 30;
        System.out.println("Quantos dias serão trabalhados: ");
        int dia = sc.nextInt();
        int dias = dia * 30;
        double diaria_com_imposto = dias - (dias * 8)/100;
        System.out.printf("O valor a ser pago para o encanador é R$%.2f%n", diaria_com_imposto);
        
    }
    
}
