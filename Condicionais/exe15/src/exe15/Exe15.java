package exe15;

import java.util.Scanner;

public class Exe15 {

    public static void main(String[] args) {
        System.out.println("Escolha um dia da semana (1 a 7)");
        int x = new Scanner(System.in).nextInt();
        String dia;
        
        switch(x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor Invalido!!";
                break;
        }
        System.out.println("Dia da semana: "+ dia);
    }
}