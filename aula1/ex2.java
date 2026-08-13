import java.util.Locale;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Insere o Nome: ");
        String nome = leitor.nextLine();
        System.out.println("Insere a Idade: ");
        int idade = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Insere o Cpf: ");
        String cpf = leitor.nextLine();
        System.out.println("Insere o Genero: ");
        char genero = leitor.next().charAt(0);
        leitor.nextLine();
        System.out.println("0:Pessoa comum | 1:Estudante : ");
        int op = leitor.nextInt();
        leitor.nextLine();

        
        switch (op) {
            case 0:
                Pessoa p = criarPessoa(nome, idade, cpf, genero);
                System.out.println("\n--- Dados da Pessoa ---");
                p.mostrarDados();
                break;
            case 1:
                System.out.println("Insere a Matricula: ");
                String matricula = leitor.nextLine();
                System.out.println("Insere a Nota 1: ");
                double nota1 = leitor.nextDouble();
                System.out.println("Insere a Nota 2: ");
                double nota2 = leitor.nextDouble();
                leitor.nextLine();
                Estudante e = criarEstudante(nome, idade, cpf, genero, matricula, nota1, nota2);
                e.mostrarDados();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        leitor.close(); 
    }

    public static Pessoa criarPessoa(String nome, int idade, String cpf, char genero){
        return new Pessoa(nome, idade, cpf, genero); 
    }

    public static Estudante criarEstudante(String nome, int idade, String cpf, char genero, String matricula, double nota1, double nota2){
        return new Estudante(nome, idade, cpf, genero, matricula, nota1, nota2);
    }
}
