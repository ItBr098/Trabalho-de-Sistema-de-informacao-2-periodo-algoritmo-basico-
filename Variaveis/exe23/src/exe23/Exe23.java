package exe23;

import java.util.Scanner;

public class Exe23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor em metros: ");
        double m = sc.nextDouble();
        double j = m / 0.91;
        System.out.printf("O valor de %.2f metros convertido para jardas é de %.2f jardas %n", m, j); 
    }
    
}
