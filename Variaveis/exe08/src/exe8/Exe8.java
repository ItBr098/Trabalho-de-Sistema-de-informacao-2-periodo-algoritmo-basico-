/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe8;

import java.util.Scanner;

/**
 *
 * @author ismalware
 */
public class Exe8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor em Kelvin: ");
        float k = sc.nextFloat();
        float conv = (float)(k-273.75);
        System.out.println("A temperatura em Kelvin transformada para  é: "+conv);
    }
    
}
