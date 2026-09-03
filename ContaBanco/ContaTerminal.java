package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Numero agencia: ");
        String agencia = sc.nextLine();

        System.out.println("Nome do cliente: ");
        String clientName = sc.nextLine();

        System.out.println("Numero da conta: ");
        int numero = sc.nextInt();

        System.out.println("Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println(formatar(clientName, agencia, numero, saldo));
        sc.close();
    }

    static String formatar(String clientName, String agencia, int numero,  double saldo){
        return "Olá "+clientName+" obrigado por criar uma conta em nosso banco, sua agencia é: "+agencia+ ", conta: "+numero+" e seu saldo: "+saldo+" ja esta disponivel para saque.";
    }
}
