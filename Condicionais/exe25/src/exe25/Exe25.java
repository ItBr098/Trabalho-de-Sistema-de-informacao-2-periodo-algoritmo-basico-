package exe25;

import java.util.Scanner;

public class Exe25 {

    public static void main(String[] args) {
        System.out.println("Informe 3 valores, separados por espaço: ");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        double c = new Scanner(System.in).nextDouble();
        double delta = 0;
        double x1 = 0;
        double x2 = 0;
        if(a != 0){
            delta = Math.pow(b, 2) - 4 * a * c;
            if(delta < 0){
                System.out.println("Não existe raiz quadrada");
            }else if(delta == 0){
                x1 = Math.sqrt(delta);
                System.out.println(x1 + " é a raiz única");
            }else if(delta > 0){
                x1 = ((-b) + Math.sqrt(delta)) / 2 * a;
                x2 = ((-b) - Math.sqrt(delta)) / 2 * a;
                System.out.println("Primeira raiz = "+ x1);
                System.out.println("Segunda raiz = "+ x2);
            }
        }else{
            System.out.println("Não é uma equação de segundo grau");;
        }
    }
    
}
