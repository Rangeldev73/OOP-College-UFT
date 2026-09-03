package aula4;

import java.util.Scanner;
import java.util.Locale;

public class ex4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double A,B,media;
        A=sc.nextDouble();
        B=sc.nextDouble();

        media = (A*3.5+B*7.5)/11;

       System.out.printf("media: %.1f%n", media);
        System.out.println();
        sc.close();
    }
}
