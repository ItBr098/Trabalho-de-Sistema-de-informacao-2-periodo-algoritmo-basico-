
package exe13;

import java.util.Scanner;

public class Exe13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma distancia em quilometros: ");
        double k = sc.nextDouble();
        double m = k / 1.61;
        System.out.printf("A distancia de %.2f Km convetida para milha é de %.2f Milhas%n", k, m);
    }
    
}
