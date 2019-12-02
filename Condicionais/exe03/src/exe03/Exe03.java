package exe03;

import java.util.Scanner;

public class Exe03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        double numero = sc.nextDouble();
        if(numero > 0){
            double raiz = Math.sqrt(numero);
            System.out.printf("A raiz quadrada de %.2f é %.2f%n", numero, raiz);
        }else{
            double porcentagem = Math.pow(numero, 2);
            System.out.printf("O número %.2f² é %.2f%n", numero, porcentagem);
        }
    }
    
}
