package exe48;

import java.util.Scanner;

public class Exe48 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um tempo em segundos: ");
        int segundos, minuto, hora, tempo;
        tempo = sc.nextInt();
        hora = (int) tempo / 3600;
        minuto = (int) (tempo % 3600) / 60;
        segundos = (int) (tempo % 3600) % 60; 
        System.out.printf("%d:%d:%d%n", hora, minuto, segundos);
    }
    
}
