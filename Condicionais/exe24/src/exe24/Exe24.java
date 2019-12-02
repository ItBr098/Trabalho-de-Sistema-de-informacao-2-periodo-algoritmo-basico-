package exe24;

import java.util.Scanner;

public class Exe24 {

    public static void main(String[] args) {
        double n;
        System.out.print("Qual a sigla do seu estado? ");
        String estado = new Scanner(System.in).next();
        System.out.print("Qual o valor do produto? ");
        double valor = new Scanner(System.in).nextDouble();
        if(estado.equalsIgnoreCase("MG")){
            n = (valor * 7 / 100);
            System.out.println("O valor do produto no seu estado é: R$"+ n);
        }else if(estado.equalsIgnoreCase("SP")){
            n = (valor * 12 / 100);
            System.out.println("O valor do produto no seu estado é: R$"+ n);
        }else if(estado.equalsIgnoreCase("RJ")){
            n = (valor * 15 / 100);
            System.out.println("O valor do produto no seu estado é: R$"+ n);
        }else if(estado.equalsIgnoreCase("MS")){
            n = (valor * 8 / 100);
            System.out.println("O valor do produto no seu estado é: R$"+ n);
        }else{
            System.out.println("Estado Invalido");
        }
    }
    
}
