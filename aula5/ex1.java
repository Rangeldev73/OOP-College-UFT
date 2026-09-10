package aula5;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double n1; 
        do {
            System.out.println("Nota 1: ");
            n1 = sc.nextDouble();
        } while (!validaNumero(n1)); 

        double n2;
        do {
            System.out.println("Nota 2: ");
            n2 = sc.nextDouble();
        } while (!validaNumero(n2));

        double media=(n1+n2)/2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) { 
            System.out.println("Recuperação");
            double recup; 
            do {
                System.out.print("Nota da recuperação: ");
                recup = sc.nextDouble();
            }  while (!validaNumero(recup));
            
            if (recup >= 5) {
                System.out.println("Aprovado na recuperação");
            } else {
                System.out.println("Reprovado na recuperação");
            }
        } else {
            System.out.println("Reprovado direto");
        }
        
        System.out.printf("Média: %.2f%n", media);
        sc.close();
    }

    static boolean validaNumero(double n) {
        return 0<=n && n<=10;
    }
}
