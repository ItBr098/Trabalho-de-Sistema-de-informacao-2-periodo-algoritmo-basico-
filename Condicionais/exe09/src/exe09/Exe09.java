package exe09;

import java.util.Scanner;

public class Exe09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual seu sálario: R$");
        double salario = sc.nextDouble();
        System.out.println("Qual o valor do emprestimo: R$");
        double emprestimo = sc.nextDouble();
        double valido = (emprestimo > (salario * 20) / 100) ? 1 : 0;
        if (valido == 1) {
            System.out.println("Empréstimo não concedido.");
        }else{
            System.out.println("Empréstimo concedido.");
        }
    }
    
}
