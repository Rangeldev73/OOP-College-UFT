package aula5;

import java.util.Scanner;
import java.util.Locale;

public class ex4 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira o plano(BASIC|MIDIA|TURBO): ");
        String plano = sc.nextLine();
        plano = plano.toUpperCase();

        switch(plano) {
            case "BASIC":
                System.out.println("100 minutos de ligação");
                break;
            case "MIDIA":
                System.out.println("100 minutos de ligação + WhatsApp e Instagram grátis");
                break;
            case "TURBO":
                System.out.println("100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB youtube");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
        sc.close();
    }
}
