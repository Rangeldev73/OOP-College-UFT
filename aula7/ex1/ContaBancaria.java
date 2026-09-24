package aula7.ex1;

public class ContaBancaria {
    private String titular;
    private String numero=null;
    private double saldo;
    private int cc=0;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if(titular == null ||titular.trim().isEmpty()) {
            System.out.println("Titular não pode ser nulo!");
            return;
        }
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void definirNumero(String numero) {
        if(cc!=0) {
            System.out.println("Numero já foi modificado!");
            return;
        }
        this.numero = numero;
        cc++;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        if(valor<=0) {
            System.out.println("O valor deve ser maior que zero");
            return false;
        }
        registrarOperacao("Deposito de "+valor);
        saldo+=valor;
        return true;
    }

    public boolean sacar(double valor) {
        if(valor<=0||valor>saldo) {
            System.out.println("Valor deve ser maior que zero e menor ou igual ao saldo");
            return false;
        }
        registrarOperacao("Saque de "+valor);
        saldo-=valor;
        return true;
    }

    private void registrarOperacao(String descricao) {
        System.out.println(descricao);
    }

    public void printarDados() {
        System.out.println("Titular: "+titular+" |Numero: "+numero+" |saldo: "+saldo);
    }
}