package exe19;

import java.util.Scanner;

public class Exe19 {

    public static void main(String[] args) {
        System.out.println("Informe um número: ");
        int numero = new Scanner(System.in).nextInt();
        if (numero % 5 == 0 && numero % 3 == 0){
            System.out.println(numero + " é divisivel por 3 e 5");
        }else if(numero % 3 == 0){
            System.out.println(numero + " é diviésivel por 3");
        }else if(numero % 5 == 0){
            System.out.println(numero + " é divisivel por 5");
        }else{
            System.out.println(numero + " não é divisivel por 5 nem por 3");
        }
    }
    
}
