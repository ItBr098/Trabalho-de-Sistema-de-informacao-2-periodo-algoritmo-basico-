package exe07;

import java.util.Scanner;

public class Exe07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int numero1 = sc.nextInt();
        System.out.println("Informe outro número inteiro: ");
        int numero2 = sc.nextInt();
        if (numero1 > numero2){
            int diferenca = (int) numero1 - numero2;
            System.out.printf("%d é maior que %d, e a diferença entre eles é de: %d%n", numero1, numero2, diferenca);
        }else if(numero2 > numero1){
            int diferenca = (int) numero2 - numero1;
            System.out.printf("%d é maior que %d, e a diferença entre eles é de: %d%n", numero2, numero1, diferenca);
        }else if (numero1 == numero2){
            System.out.println("O números são igual e a diferença entre eles é 0");
        }
    }
    
}
