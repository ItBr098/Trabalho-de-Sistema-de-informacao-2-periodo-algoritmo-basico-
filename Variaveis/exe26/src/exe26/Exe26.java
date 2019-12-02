
package exe26;

import java.util.Scanner;

public class Exe26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor em M²: ");
        double metros = sc.nextDouble();
        double hectar = metros * 0.0001;
        System.out.printf("O valor de %.2fm² convertido para hectar é de %.2fhec%n", metros, hectar);
    }
    
}
