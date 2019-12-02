package exe30;

import java.util.Scanner;

public class Exe30 {

    public static void main(String[] args) {
        System.out.print("Informe um número inteiro: ");
        int n1 = new Scanner(System.in).nextInt();
        System.out.print("Informe um número inteiro: ");
        int n2 = new Scanner(System.in).nextInt();
        System.out.print("Informe um número inteiro: ");
        int n3 = new Scanner(System.in).nextInt();
        int maior = 0;
        int meio = 0;
        int menor = 0;
        if(n1 > n2 && n1 > n3){
            maior = n1;
            if(n2 > n3){
                meio = n2;
                menor = n3;
            }else if(n3 > n2){
                meio = n3;
                menor = n2;
            }
        }else if(n2 > n3 && n2 > n1){
            maior = n2;
            if(n1 > n3){
                meio = n1;
                menor = n3;
            }else if(n3 > n1){
                meio = n3;
                menor = n1;
            }
        }else if(n3 > n1 && n3 > n2){
            maior = n3;
            if(n2 > n1){
                meio = n2;
                menor = n1;
            }else if(n1 > n2){
                meio = n1;
                menor = n2;
            }
        }
        System.out.println(""+maior+" "+meio+" "+menor);
    }
    
}
