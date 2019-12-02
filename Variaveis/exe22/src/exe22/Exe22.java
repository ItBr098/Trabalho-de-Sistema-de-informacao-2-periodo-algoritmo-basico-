package exe22;

import java.util.Scanner;

public class Exe22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor em Jardas: ");
        double j = sc.nextDouble();
        double m = j * 0.91;
        System.out.printf("O valor de %.2f jardas convertido para metros é de %.2fm %n", j, m);
    }
    
}
