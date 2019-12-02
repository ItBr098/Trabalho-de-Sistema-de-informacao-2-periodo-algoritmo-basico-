package exe49;

import java.util.Scanner;

public class Exe49 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o horario de inicio (separando por espaço cada um dos valores): hh:mm:ss");
        int hora_inicial = sc.nextInt();
        int minuto_inicial = sc.nextInt();
        int segundo_inicial = sc.nextInt();
        System.out.println("Qual foi a duração (em segundos): ");
        int tempo = sc.nextInt();
        int hora = (int) (tempo / 3600) + hora_inicial;
        int minuto = (int) ((tempo % 3600) / 60) + minuto_inicial;
        int segundos = (int) ((tempo % 3600) % 60) + segundo_inicial;
        String horario_final = hora + ":" + minuto + ":" + segundos; 
        System.out.println("O termino da sessão é às: "+horario_final);
        
        
    }
    
}
