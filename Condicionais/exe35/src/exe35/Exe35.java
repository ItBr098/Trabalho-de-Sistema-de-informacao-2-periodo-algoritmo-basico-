package exe35;

import java.util.Scanner;

public class Exe35 {

    public static void main(String[] args) {
        boolean bissexto = false;
        System.out.println("Informe uma data");
        System.out.print("Dia: ");
        int dia = new Scanner(System.in).nextInt();
        System.out.print("Mês: ");
        int mes = new Scanner(System.in).nextInt();
        System.out.print("Ano: ");
        int ano = new Scanner(System.in).nextInt();
        if(ano % 4 == 0 || ano % 400 == 0){
            bissexto = true;
        }
        if(mes >=1 && mes <= 12){
            if(bissexto == true && mes == 2 && dia <= 29){
                System.out.println("Data valida, e o ano é bissexto");
            }else if(bissexto == false && mes == 2 && dia <= 28){
                System.out.println("Data valida");
            }else if(mes == 2 && dia > 28){
                System.out.println("Data invalida");
            }else if(dia <= 31){
                System.out.println("Data valida");
            }else if(dia > 31){
                System.out.println("Data invalida");
            }
        }else{
            System.out.println("Mês invalido");
        }
    }
    
}
