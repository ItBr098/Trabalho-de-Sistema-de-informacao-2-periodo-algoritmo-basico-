package exe7;

import java.util.Locale;
import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float f, conv;
        System.out.println("Digite uma temperatura em °F: ");
        f = sc.nextFloat();
        conv = (5*(f-32)/9);
        System.out.printf("A temperatura em Fahrenheit: %.1f convertido para Celsius é: %.1f%n",f ,conv);
    }
    
}
