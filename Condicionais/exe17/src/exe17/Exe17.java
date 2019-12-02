package exe17;

import java.util.Scanner;

public class Exe17 {

    public static void main(String[] args) {
        System.out.print("Qual a base menor: ");
        double base_menor = new Scanner(System.in).nextDouble();
        System.out.print("Qual a base maior: ");
        double base_maior = new Scanner(System.in).nextDouble();
        System.out.print("Qual a altura: ");
        double altura = new Scanner(System.in).nextDouble();
        double area = (base_maior * base_menor) * altura / 2;
        System.out.printf("A área do trapézio é de %.2f%n", area);
    }
    
}
