package aula6;

import java.util.concurrent.ThreadLocalRandom;

public class ex2 {
    
    public static void main(String[] args) {
        String candidatos[] = {"FELIPE", "MÁRCIA", "JÚLIA", "PAULO", "AUGUSTO", "MONICA", "JÕAO", "NEY", "RICARDO"};
        case2(candidatos);
    }
    static void case2(String candidatos[]) {

        double sb = 2000;
        int totalSelecionados=0,proximoCandidato=0;
        String selecionados[] = new String[5];
        while(totalSelecionados<5 && proximoCandidato<candidatos.length) {
            String candidato = candidatos[proximoCandidato++];
            double valorPretendido = valorPretendido();
            System.out.println("O candidato "+candidato+" esta pedindo "+ valorPretendido);
            if(valorPretendido>sb) System.out.println("Candidato não foi selecionado!");
            else {
                System.out.println("O candidato foi selecionado!");
                selecionados[totalSelecionados] = candidato;
                totalSelecionados++;
            }
        }   
        System.out.println("Total de selecionados "+ totalSelecionados);
        System.out.println("Total de consultados "+ proximoCandidato);
        imprimir(selecionados);
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1000, 2200);
    }
    static void imprimir(String selecionados[]){
        for(String candidato : selecionados){
            if(candidato!=null) {
                System.out.println(candidato);
            }
        }
    }
}
