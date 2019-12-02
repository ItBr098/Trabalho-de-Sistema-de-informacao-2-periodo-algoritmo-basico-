package exe14;

import java.util.Scanner;

public class Exe14 {

    public static void main(String[] args) {
        System.out.print("Nota do trabalho: ");
        double trabalho = new Scanner(System.in).nextDouble();
        System.out.print("Nota da avaliação: ");
        double avaliacao = new Scanner(System.in).nextDouble();
        System.out.print("Nota do exame final: ");
        double exame = new Scanner(System.in).nextDouble();
        if (trabalho >=0 && trabalho <= 10 && avaliacao >= 0 && avaliacao <= 10 && exame >= 0 && exame <= 10){
            double media = ((trabalho * 2) + (avaliacao * 3) + (exame * 5)) / (2 + 3 + 5);
            if(media >= 0 && media <=2.99){
                System.out.printf("Sua média é %.2f e está reprovado%n", media);
            }else if(media >= 3 && media <= 4.99){
                System.out.printf("Sua média é %.2f e está de recuperação%n", media);
            }else if(media >= 5){
                System.out.printf("Sua média é %.2f e está aprovado%n", media);
            }
        }else{
            System.out.println("Uma ou todas as nota(s) é(são) invalida(s)");
        }
    }
    
}
