package exe01;

import java.util.Scanner;

public class Exe01 {

    public static void main(String[] args) {
        System.out.println("Informe um número: ");
        double numero1 = new Scanner(System.in).nextDouble();
        System.out.println("Informe outro número: ");
        double numero2 = new Scanner(System.in).nextDouble();
        if(numero1 > numero2){
            System.out.printf("%.2f é maior que %.2f", numero1, numero2);
        }else{
            System.out.printf("%.2f é maior que %.2f", numero2, numero1);
        }
    }
    
}
