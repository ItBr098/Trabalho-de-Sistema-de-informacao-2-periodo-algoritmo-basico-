package exe27;

import java.util.Scanner;

public class Exe27 {

    public static void main(String[] args) {
        System.out.print("Informe sua idade: ");
        int idade = new Scanner(System.in).nextInt();
        if(idade >= 5 && idade <= 7){
            System.out.println("Sua categoria é Infantil A");
        }else if(idade >= 8 && idade <= 10){
            System.out.println("Sua categoria é Infantil B");
        }else if(idade >= 11 && idade <= 13){
            System.out.println("Sua categoria é Juvenil A");
        }else if(idade >= 14 && idade <= 17){
            System.out.println("Sua categoria é Juvenil B");
        }else if(idade >= 18){
            System.out.println("Sua categoria é Sênior");
        }
    }
    
}
