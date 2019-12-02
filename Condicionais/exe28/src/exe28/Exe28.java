package exe28;

import java.util.Scanner;

public class Exe28 {

    public static void main(String[] args) {
        System.out.print("Informe números inteiros: ");
        int n1 = new Scanner(System.in).nextInt();
        int n2 = new Scanner(System.in).nextInt();
        int n3 = new Scanner(System.in).nextInt();
        if(n1 > 0 && n2 > 0 && n3 > 0){
            System.out.println("Escolha uma das opções: ");
            System.out.println("1. Geométrica");
            System.out.println("2. Ponderada");
            System.out.println("3. Harmônica");
            System.out.println("4. Aritmética");
            System.out.print("Sua escolha é (1 a 4): ");
            int escolha = new Scanner(System.in).nextInt();
            switch(escolha){
                case 1:
                    double a = Math.cbrt(n1*n2*n3);
                    System.out.printf("Geometria de %d, %d, %d é: %.2f%n", n1, n2, n3, a);
                    break;
                case 2:
                    double b = (((n1+2)*(n2+3)*(n3))/6);
                    System.out.printf("A Ponderada de %d, %d, %d é: %d %n", n1, n2, n3, b);
                    break;
                case 3:
                    double c = (1/((1/n1)+(1/n2)+(1/n3)));
                    System.out.printf("A harmônica de %d, %d, %d é: %d %n", n1, n2, n3, c);
                    break;
                case 4:
                    double d = (n1 + n2 + n3)/3;
                    System.out.printf("A aritmética de %d, %d, %d é: %d%n", n1, n2, n3, d);
                    break;
                default:
                    System.out.println("Valor invalido, PROGRAMA ENCERRADO!");
            }
        }else{
            System.out.println("Número informado é negativo ou invalido!!");
        }
    }
    
}
