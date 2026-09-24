package aula6.ex3;

public class Main {
    
    public static void main(String[] args) {

        Candidato candidato = new Candidato("Ney");

        while (candidato.getTent() < 3 && !candidato.getAtendeu()) {
            candidato.tentarLigacao();
        }
        
        if (candidato.getAtendeu()) {
            System.out.println("O candidato " + candidato.getNome() + " atendeu a ligação após " + candidato.getTent() + " tentativa(s)!");
        } else {
            System.out.println("Não conseguimos contato com o candidato " + candidato.getNome() + ". Limite de tentativas atingido.");
        }
    }
}
