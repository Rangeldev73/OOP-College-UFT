package aula5;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira o plano(BASIC|MIDIA|TURBO): ");
        String plano = sc.nextLine();
        plano = plano.toUpperCase();

        switch(plano) {
            case "TURBO":
                System.out.println("5 GB youtube");
            case "MIDIA":
                System.out.println("WhatsApp e Instagram grátis");
            case "BASIC":
                System.out.println("100 minutos de ligação"); 
        }
        sc.close();
    }
}
