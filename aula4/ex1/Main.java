package aula4.ex1;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    static List<Double> numbers = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            System.out.println((i+1)+": ");
            double valor = scanner.nextDouble();
            numbers.add(valor);
        }
        for(double n : numbers) {
            System.out.println(" Pega: "+ n);
        }
    }
}
