package exe37;

import java.util.Scanner;

public class Exe37 {

    public static void main(String[] args) {
        double valor = 0;
        System.out.println("Informe os seguintes dados: ");
        System.out.print("Dias: ");
        int dias = new Scanner(System.in).nextInt();
        System.out.print("Horas: ");
        int hora = new Scanner(System.in).nextInt();
        System.out.println("Minutos: ");
        int minutos = new Scanner(System.in).nextInt();
        if(dias == 0 && hora <= 24){
            if(minutos <= 120){
                valor = 1;
            }else if(minutos > 120 && minutos <= 240){
                valor = 1.40;
            }else if(minutos > 240){
                valor = 2;
            }
        }else if(dias > 1  && hora <= 24){
            if(minutos <= 120){
                valor = 1;
            }else if(minutos > 120 && minutos <= 240){
                valor = 1.40;
            }else if(minutos > 240){
                valor = 2;
            }
            valor = valor * (dias + 1);
        }
        System.out.println("valor a ser pago é: R$"+valor);
    }
}
