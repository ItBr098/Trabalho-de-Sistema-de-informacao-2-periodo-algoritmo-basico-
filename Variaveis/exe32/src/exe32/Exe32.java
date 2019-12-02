package exe32;

import java.util.Scanner;

public class Exe32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe um valor: ");
        int numero = sc.nextInt();
        int suc_tri = (numero * 3) + 1;
        int ant_dob = (numero * 2) - 1;
        int soma = ant_dob + suc_tri;
        System.out.printf("A soma de %d + %d é igual há %d%n", suc_tri, ant_dob, soma);
    }
    
}
