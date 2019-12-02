
package exe12;

import java.util.Scanner;

public class Exe12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma distancia em milhas: ");
        double m = sc.nextDouble();
        double k = 1.61 * m;
        System.out.printf("A distancia de %.2f Milhas convetida para quilometro é de %.2f Km%n", m, k);
    }
    
}
