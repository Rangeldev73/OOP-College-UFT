package aula5;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira o tamanho(P|M|G): ");
        String sigla = sc.nextLine();
        sigla = sigla.toUpperCase();

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
        sc.close();
    }
}
