package exe05;

import java.util.Scanner;

public class Exe05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        if ((numero % 2) == 0){
            System.out.printf("O número %d é par%n", numero);
        }else{
            System.out.println("O número %d é impar%n");
        }
    }
    
}
