package exe50;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exe50 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        int ano = Integer.valueOf(sdf.format(new Date()));
        System.out.println("Qual sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Seu ano de nascimento é "+ (ano - idade));
    }
    
}
