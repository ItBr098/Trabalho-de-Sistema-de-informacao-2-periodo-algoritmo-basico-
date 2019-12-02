package exe11;

import java.util.Scanner;

public class Exe11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número inteiro para somar seus algarismos: ");
        int numero = sc.nextInt();
        int soma = 0;
        if (numero > 0 ){
            while(numero > 0){
                soma += (numero % 10);
                numero /= 10;
            }
            System.out.println("O valor da soma é "+soma);
        }else{
            System.out.println("Número invalido");
        }
    }
    
}
