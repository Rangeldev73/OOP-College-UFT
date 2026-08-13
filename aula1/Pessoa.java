public class Pessoa {
    
    private String nome;
    private int idade;
    private String cpf;
    private char genero;

    public Pessoa(){}

    public Pessoa(String nome, int idade, String cpf, char genero){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        setGenero(genero);
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getCpf(){
        return cpf;
    }

    public char getGenero(){
        return genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setGenero(char genero){
        char generoMaiusculo = Character.toUpperCase(genero);
        if (generoMaiusculo == 'M' || generoMaiusculo == 'F') {
            this.genero = generoMaiusculo;
        } else {
            System.out.println("Erro: genero invalido ");
            this.genero = 'I';
        }
    }

    public boolean verificarMaioridade(){
    return this.idade >= 18;
    }

    public void mostrarDados(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        System.out.println("Cpf: " +this.cpf);
        System.out.println("Genero: " +this.genero);
    }
}