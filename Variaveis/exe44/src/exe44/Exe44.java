package exe44;

import java.util.Scanner;

public class Exe44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a altura do degrau: ");
        double degrau = sc.nextDouble();
        System.out.print("Qual altura deseja alcançar: ");
        double altura = sc.nextDouble();
        double total_a_subir = altura / degrau;
        System.out.printf("o total de degraus a serem subidos é de %.2f%n", total_a_subir);
    }
    
}
