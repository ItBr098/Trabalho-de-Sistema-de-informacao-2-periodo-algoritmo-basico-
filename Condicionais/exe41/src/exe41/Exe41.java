package exe41;

import java.util.Scanner;

public class Exe41 {

    public static void main(String[] args) {
        System.out.print("Qual seu IMC: ");
        double imc = new Scanner(System.in).nextDouble();
        if(imc <= 18.5){
            System.out.println("Abaixo do peso!");
        }else if(imc >= 18.6 && imc <= 24.9){
            System.out.println("Saudável!");
        }else if(imc >= 25 && imc <= 29.9){
            System.out.println("Peso em excesso!");
        }else if(imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade grau I!");
        }else if(imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade grau II (severa)!");
        }else if(imc >= 40){
            System.out.println("Obesidade grau III (mórbia)!");
        }
    }
    
}
