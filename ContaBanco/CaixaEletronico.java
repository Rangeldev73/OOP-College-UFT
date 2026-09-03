package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Valor Solicitado: ");
        double valorSolicitado = sc.nextDouble();

        if (valorSolicitado < saldo) {
            saldo-=valorSolicitado;
        }
        
        System.out.println(saldo);
    }
}
