package exe39;

import java.util.Scanner;

public class Exe39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = 780000;
        double primeiro = (780000 * 46) /100;
        double segundo = (780000 * 32) / 100;
        double terceiro = (780000 * 22) / 100;
        System.out.printf("O valor recebido pelo primeiro é %.2f, do segundo é %.2f e do terceiro é %.2f%n", primeiro, segundo, terceiro);
    }
    
}
