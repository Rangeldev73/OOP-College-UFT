package aula7.ex1;

public class Main {

    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        c.definirNumero("626272-2");
        c.setTitular("Lusju");
        c.depositar(6262);
        c.definirNumero("567289");
        c.sacar(2323);
        c.printarDados();
    }
}