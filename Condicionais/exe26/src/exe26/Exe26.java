package exe26;

import java.util.Scanner;

public class Exe26 {

    public static void main(String[] args) {
        System.out.print("Qual a distância em Km/h: ");
        double distancia = new Scanner(System.in).nextDouble();
        System.out.print("Quanto foi a quantidade de gasolina consumida: ");
        double l = new Scanner(System.in).nextDouble();
        double consumo = distancia / l;
        if(consumo < 8){
            System.out.println("Venda o carro!!");
        }else if (consumo >= 8 && consumo <= 14){
            System.out.println("Economico!");
        }else if (consumo > 14){
            System.out.println("Super economico!");
        }
    }
    
}
