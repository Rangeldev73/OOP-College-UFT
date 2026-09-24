package aula7.escola;

import java.util.Locale;
import java.util.Scanner;

public class Escola {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Aluno a1 = new Aluno();
        String name = sc.nextLine();
        int age = sc.nextInt();
        a1.setName(name);
        a1.setAge(age);
        a1.setMatricula("23567yuoijkjhbgt");
        System.out.println("O aluno "+a1.getName()+" tem "+a1.getAge()+" anos!");
        sc.close();
    }
}