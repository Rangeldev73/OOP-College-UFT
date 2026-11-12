package Cadastro;

public class SistemaCadastro {

     public static void main(String[] args) {
        Pessoa leo = new Pessoa("Leo", "7218271898", "Maraca");
        
        Pessoa ney = new Pessoa();
        ney.setName("Ney");
        ney.setCpf("56789087");
        ney.setEndereco("Lagoa");

        System.out.println(leo);
        System.out.println(ney);
    }
}
