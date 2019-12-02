
package exe21;

import java.util.Scanner;

public class Exe21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Apresente um valor em Libras: ");
        double li = sc.nextDouble();
        double q = li * 0.45;
        System.out.printf("O valor de %.2fli convertido para Quilograma é de %.2fkg%n", li, q);
    }
    
}
