package exe10;

import java.util.Locale;
import java.util.Scanner;

public class Exe10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu sexo: m/f");
        String sexo = sc.next();
        Locale.setDefault(Locale.US);
        System.out.println("Qual sua altura?");
        double altura = sc.nextDouble();
        if(sexo.equalsIgnoreCase("m")){
            double ideal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é: %.2fKg%n",ideal);
        }else{
            double ideal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é: %.2fKg%n",ideal);
        }
    }
    
}
