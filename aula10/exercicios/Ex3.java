package aula10.exercicios;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fatorial(n));
        sc.close();
    }
     private static long fatorial(int n) {
        if(n <= 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
}
