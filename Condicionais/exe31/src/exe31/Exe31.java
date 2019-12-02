package exe31;

import java.util.Scanner;

public class Exe31 {

    public static void main(String[] args) {
        System.out.print("Informe sua altura: ");
        double altura = new Scanner(System.in).nextDouble();
        System.out.println("Informe seu peso: ");
        double peso = new Scanner(System.in).nextDouble();
        if(altura < 1.20 && peso < 60){
            System.out.println("sua classificação é: A");
        }else if(altura < 1.20 && peso >= 60 && peso <= 90){
            System.out.println("sua classificação é: D");
        }else if(altura < 1.20 && peso >90){
            System.out.println("sua classificação é: G");
        }else if(altura >= 1.20 && altura <= 1.70 && peso < 60){
            System.out.println("sua classificação é: B");
        }else if(altura >= 1.20 && altura <= 1.70 && peso >= 60 && peso <= 90){
            System.out.println("sua classificação é: E");
        }else if(altura >= 1.20 && altura <= 1.70 && peso >90){
            System.out.println("sua classificação é: H");
        }else if(altura > 1.70 && peso < 60){
            System.out.println("sua classificação é: C");
        }else if(altura > 1.70 && peso >= 60 && peso <= 90){
            System.out.println("sua classificação é: F");
        }else if(altura > 1.70 && peso >90){
            System.out.println("sua classificação é: I");
        }
    }
    
}
