
package exe18;

import java.util.Scanner;

public class Exe18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor em m³: ");
        double m = sc.nextDouble();
        double l = 1000 * m;
        System.out.printf("O valor de %.2fm³ convertido para litros é de %.2fL%n", m, l);
    }
    
}
