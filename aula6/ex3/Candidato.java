package aula6.ex3;

import java.util.concurrent.ThreadLocalRandom;

public class Candidato {
    private String nome;
    private int tent;
    private boolean atendeu;

    public Candidato(String nome) {
        this.nome = nome;
        this.tent = 0;
        this.atendeu = false;
    }

    public boolean tentarLigacao() {
        if (tent == 3) {
            System.out.println("Limite atingido!");
            return false;
        }
        boolean ligou = ThreadLocalRandom.current().nextBoolean(); 
        tent++;
        atendeu = ligou; 
        return atendeu;
    }

    public int getTent() {
        return tent;
    }
    
    public String getNome() {
        return nome;
    }

    public boolean getAtendeu() {
        return atendeu;
    }
}
