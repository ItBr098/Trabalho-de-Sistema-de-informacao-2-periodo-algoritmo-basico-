package exe13;

import java.util.Scanner;

public class Exe13 {

    public static void main(String[] args) {
        System.out.print("Informe a primeira nota: ");
        double nota1 = new Scanner(System.in).nextDouble();
        System.out.print("Informe a segunda nota: ");
        double nota2 = new Scanner(System.in).nextDouble();
        System.out.print("Informe a terceira nota: ");
        double nota3 = new Scanner(System.in).nextDouble();
        if (nota1 >= 0 && nota2 >= 0 && nota3 >=0 && nota1 <= 10 && nota2 <= 10 && nota3 <= 10){
            double nota_1 = nota1 * 1;
            double nota_2 = nota2 * 1;
            double nota_3 = nota3 * 2;
            double soma_notas = (nota_1 + nota_2 + nota_3) * 3;
            if(soma_notas >= 60){
                System.out.printf("sua média é %.2f e está aprovado!!%n", soma_notas);
            }else{
                System.out.printf("Sua média é %.2f e está reprovado!!%n", soma_notas);
            }
        }
    }
    
}
