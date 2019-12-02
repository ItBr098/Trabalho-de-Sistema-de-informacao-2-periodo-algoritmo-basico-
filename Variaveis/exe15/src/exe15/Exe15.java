
package exe15;

import java.util.Scanner;

public class Exe15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor em Radios: ");
        double r = sc.nextDouble();
        double g = r * 180/3.14;
        System.out.printf("O valor de %.2f radius em Graus é de %.2f°%n", r, g);
    }
    
}
