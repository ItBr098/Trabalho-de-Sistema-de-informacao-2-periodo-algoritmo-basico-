package exe27;

import java.util.Scanner;

public class Exe27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor em hectar: ");
        double hectar = sc.nextDouble();
        double metros = hectar * 10000;
        System.out.printf("O valor de %.2fhec convertido para metros quadrados é de %.2fm²%n", hectar, metros);
    }
    
}
