package exe46;

import java.util.Scanner;

public class Exe46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numéro entre 100 e 999: ");
        int numero = sc.nextInt();
        Integer a = numero;
	String valor = a.toString();
	String primeiro_valor = valor.substring(2);
        String segundo_valor = valor.substring(1, 2);
        String terceiro_valor = valor.substring(0, 1);
        String juncao = primeiro_valor + segundo_valor + terceiro_valor;
        System.out.println(juncao);
    }
    
}
