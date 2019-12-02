package exe6;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float C, conv;
        System.out.println("Digite uma temperatura em °C: ");
        C = sc.nextFloat();
        conv= (float) (C*(9.0/5.0)+32.0);
        System.out.println("Os graus em C convertidos em F é: "+conv);
    }
    
}
