package exe12;

import java.util.Scanner;

public class Exe12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = sc.nextInt();
        if(numero > 0){
            double log = Math.log(numero);
            System.out.printf("O logaritimo de %.2f é igual a %.2f%n",numero, log);
        }else{
            System.out.println("Número inválido!!");
        }
    }
    
}
