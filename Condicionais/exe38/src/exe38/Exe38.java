package exe38;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exe38 {

    public static void main(String[] args) {
        Calendar cal = GregorianCalendar.getInstance();
        boolean bissexto = false;
        System.out.println("Informe sua data de nascimento");
        System.out.print("Dia: ");
        int dia = new Scanner(System.in).nextInt();
        System.out.print("Mês: ");
        int mes = new Scanner(System.in).nextInt();
        System.out.print("Ano: ");
        int ano = new Scanner(System.in).nextInt();
        if(ano % 4 == 0 || ano % 400 == 0){
            bissexto = true;
        }
        if(ano <= cal.get(Calendar.YEAR)){
            if(mes >=1 && mes <= 12){
                    if(bissexto == true && mes == 2 && dia <= 29){
                        System.out.println("data valida");
                    }else if(mes == 2 && dia <= 28){
                        System.out.println("Data valida");
                    }else if(mes == 2 && dia > 28){
                        System.out.println("Data invalida");
                    }else if(mes == 4 || mes== 6 || mes == 9 || mes == 11 && dia <= 30){
                        System.out.println("Data valida");
                    }else if(mes == 1 || mes== 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia <= 31){
                        System.out.println("Data valida");
                    }else{
                        System.out.println("Data invalida");
                    }
                }else{
                    System.out.println("Data invalida");
                }
            }else{
                System.out.println("Data invalida");
            }
    }
    
}
