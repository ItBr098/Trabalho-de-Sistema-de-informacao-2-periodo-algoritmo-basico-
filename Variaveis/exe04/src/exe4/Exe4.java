/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe4;

import java.util.Scanner;

/**
 *
 * @author ismalware
 */
public class Exe4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        float n1 = sc.nextFloat();
        System.out.println("O quadrado de: "+n1+" é: "+(n1*n1));
    }
    
}
