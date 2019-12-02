package exe08;

import java.util.Scanner;

public class Exe08 {

    public static void main(String[] args) {
    /*Faça um programa que leia 2 notas de um aluno, verifique se as notas são válidas e exiba na tela
a média destas notas. Uma nota válida deve ser, obrigatoriamente, um valor entre 0.0 e 10.0, onde
caso a nota não possua um valor válido, este fato deve ser informado ao usuário e o programa
termina.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();
        if(nota1 <= 10 && nota2 <= 10 && nota1 >= 0 && nota2 >= 0){
            double media = (nota1 + nota2) / 2;
            System.out.printf("A média das notas é: %.2f%n", media);
        }else{
            System.out.println("Notas invalidas");
        }
    }
    
}
