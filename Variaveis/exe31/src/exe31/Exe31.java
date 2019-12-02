
package exe31;

import java.util.Scanner;

public class Exe31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numero = sc.nextInt();
        int ant = numero - 1;
        int suc = numero + 1;
        System.out.printf("O antecessor de %d é %d e seu sucessor é %d%n", numero, ant, suc);
    }
    
}
