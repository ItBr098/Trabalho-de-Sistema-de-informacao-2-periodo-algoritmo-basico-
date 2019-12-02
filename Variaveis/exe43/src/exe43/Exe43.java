package exe43;

import java.util.Scanner;

public class Exe43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o Valor: R$");
        double valor = sc.nextDouble();
        double total = valor - (valor * 10 / 100);
        System.out.printf("Total a pagar: R$%.2f%n", total);  
        double parcela = valor / 3;
        System.out.printf("Valor parcelado em 3 vezes, valor de cada parcela: R$%.2f%n", parcela);
        double comissao_a_vista = (total * 5 / 100);
        System.out.printf("Comissão do vendedor, caso o valor seja pago a vista: R$%.2f%n", comissao_a_vista);
        double comissao_Parcelado = (valor * 5 / 100);
        System.out.printf("Comissão do vendedor, caso o valor seja pago parcelado: R$%.2f%n", comissao_Parcelado);
    }
    
}
