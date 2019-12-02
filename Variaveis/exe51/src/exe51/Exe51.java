package exe51;

import java.util.Scanner;

public class Exe51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva as coordenadas x e y: ");
        double coordenada_x = sc.nextDouble();
        double coordenada_y = sc.nextDouble();
        double R = Math.sqrt(Math.pow(coordenada_x, 2) + Math.pow(coordenada_y, 2));
        System.out.printf("A distancia é de %.2f%n", R);
    }
    
}
