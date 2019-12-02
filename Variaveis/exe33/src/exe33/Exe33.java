
package exe33;

import java.util.Scanner;

public class Exe33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho de um dos lados do quadrado: ");
        double lado = sc.nextDouble();
        double area = Math.pow(lado, 2);
        System.out.printf("A área do quadrado é de %.2f%n", area);
    }
    
}
