package exe23;

import java.util.Scanner;

public class Exe23 {

    public static void main(String[] args) {
        System.out.print("Informe um ano: ");
        int ano = new Scanner(System.in).nextInt();
        if(ano % 4 == 0 && ano % 400 == 0){
            System.out.println("Ano é bissexto");
        }else if(ano % 100 != 0){
            System.out.println("O ano não é bissexto");
        }
    }
    
}
