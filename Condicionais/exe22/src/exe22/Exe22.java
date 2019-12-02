package exe22;

import java.util.Scanner;

public class Exe22 {

    public static void main(String[] args) {
        System.out.print("Informe sua idade: ");
        int idade = new Scanner(System.in).nextInt();
        System.out.println("Qual seu tempo de trabalho: ");
        int tempo_de_trabalho = new Scanner(System.in).nextInt();
        System.out.print("Deseja se aposentar? s/n");
        String op = new Scanner(System.in).next();
        if(op.equalsIgnoreCase("S")){
            if(idade == 65 || tempo_de_trabalho == 30){
                System.out.println("Você está aposentado!");
            }else if(idade == 60 && tempo_de_trabalho == 25){
                System.out.println("Você está aposentado!");
            }else{
                System.out.println("Desculpe, você não pode se aposentar");
            }
        }
    }
    
}
