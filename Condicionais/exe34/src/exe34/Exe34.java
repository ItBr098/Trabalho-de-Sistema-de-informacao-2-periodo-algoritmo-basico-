package exe34;

import java.util.Scanner;

public class Exe34 {

    public static void main(String[] args) {
        System.out.print("Qual a nota do aluno: ");
        double nota = new Scanner(System.in).nextDouble();
        System.out.print("Informe o número de faltas: ");
        int numero_de_faltas = new Scanner(System.in).nextInt();
        if(nota >= 9 && nota <=10 && numero_de_faltas <= 20){
            System.out.println("Seu conceito é A");
        }else if(nota >= 9 && nota <=10 && numero_de_faltas > 20){
            System.out.println("Seu conceito é B");
        }else if(nota >= 7.5 && nota <= 8.9 && numero_de_faltas <= 20){
            System.out.println("Seu conceito é B");
        }else if(nota >= 7.5 && nota <= 8.9 && numero_de_faltas > 20){
            System.out.println("Seu conceito é C");
        }else if(nota >= 5 && nota <= 7.4 && numero_de_faltas <= 20){
            System.out.println("Seu conceito é C");
        }else if(nota >= 5 && nota <= 7.4 && numero_de_faltas > 20){
            System.out.println("Seu conceito é D");
        }else if(nota >= 4 && nota <= 4.9 && numero_de_faltas <= 20){
            System.out.println("Seu conceito é D");
        }else if(nota >= 4 && nota <= 4.9 && numero_de_faltas > 20){
            System.out.println("Seu conceito é E");
        }else if(nota >= 0 && nota <= 3.9 && numero_de_faltas <= 20){
            System.out.println("Seu conceito é E");
        }else if(nota >= 0 && nota <= 3.9 && numero_de_faltas > 20){
            System.out.println("Seu conceito é E");
        }
    }
    
}
