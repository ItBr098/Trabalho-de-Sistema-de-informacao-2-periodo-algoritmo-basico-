package exe47;

import java.util.Scanner;

public class Exe47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um numero entre 1000 e 9999: ");
        Integer numero = sc.nextInt();
        String n = numero.toString();
        String valor1 = n.substring(0, 1);
        System.out.println(valor1);
        String valor2 = n.substring(1, 2);
        System.out.println(valor2);
        String valor3 = n.substring(2, 3);
        System.out.println(valor3);
        String valor4 = n.substring(3);
        System.out.println(valor4);
    }
    
}
