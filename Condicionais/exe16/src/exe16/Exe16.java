package exe16;

import java.util.Scanner;

public class Exe16 {

    public static void main(String[] args) {
        System.out.print("Informe um número de 1 a 12: ");
        int numero = new Scanner(System.in).nextInt();
        String mes = null;
        switch (numero){
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
        }
        System.out.printf("O número %d corresponde a %s%n", numero, mes);
    }
    
}
