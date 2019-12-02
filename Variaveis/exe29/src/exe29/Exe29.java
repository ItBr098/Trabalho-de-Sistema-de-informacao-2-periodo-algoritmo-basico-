package exe29;

import java.util.Scanner;

public class Exe29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota[] = new double [5];
        for (int i = 1; i <= 4; i++) {
            System.out.printf("Informe a nota %d: %n", i);
            nota[i] = sc.nextDouble();
        }
        double media = (nota[1] + nota[2] +nota[3] + nota[4]) / 4;
        System.out.printf("A media é de %.2f%n", media);
    }
    
}
