
package exe20;

import java.util.Scanner;

public class Exe20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Apresente um valor em quilogramas: ");
        double q = sc.nextDouble();
        double li = q /0.45;
        System.out.printf("O valor de %.2fkg convertido para libras é de %.2fli%n", q, li);
    }
    
}
