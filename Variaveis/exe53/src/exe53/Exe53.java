package exe53;

import java.util.Scanner;

public class Exe53 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o comprimento: ");
        double comprimento = sc.nextDouble();
        System.out.println("Informe a largura: ");
        double largura = sc.nextDouble();
        System.out.print("Quanto custa o metro da tela: R$");
        double tela = sc.nextDouble();
        double total_para_cercar = (comprimento * largura) * tela;
        System.out.printf("O total a se pagar para cercar um terreno de %.2f x %.2f é de R$%.2f%n", comprimento, largura, total_para_cercar);
    }
    
}
