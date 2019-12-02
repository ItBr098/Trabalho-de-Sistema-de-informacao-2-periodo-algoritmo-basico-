package exe35;

import java.util.Scanner;

public class Exe35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de 'a': ");
        double a = sc.nextDouble();
        System.out.println("Informe o valor de 'b': ");
        double b = sc.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("A Hipotenusa do trinagulo com valor de A=%.2f e B=%.2f é igual à %.2f%n", a, b, hipotenusa);
    }
    
}
