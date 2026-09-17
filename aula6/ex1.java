package aula6;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {
    
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Salário pretendido: ");
        double sp = sc.nextDouble();
        double sb = 2000;

        if(sb>sp) System.out.println("LIGAR PARA CANDIDATO!");
        else if(sb==sp) System.out.println("LIGAR PARA O CANDIDATO, COM CONTRAPOPOSTA!");
        else System.out.println("AGUARDADNO RESULTADOS DOS DEMAIS CANDIDATOS");
        sc.close();
    }
}