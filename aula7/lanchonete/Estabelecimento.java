package aula7.lanchonete;

import aula7.lanchonete.atendimento.Atendente;
import aula7.lanchonete.atendimento.cozinha.Almoxarife;
import aula7.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {

    public static void main(String[] args) {

        Cozinheiro cozinheiro = new Cozinheiro();
        Almoxarife almoxarife = new Almoxarife();
        Atendente atendente = new Atendente();

        //Ações que não precisam estar disponiveis para todo mundo
        //aplicação
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaNoLiquidificador();
        cozinheiro.prepararLanche();
        cozinheiro.prepararLanche();
        cozinheiro.pedirParaTrocarGas(almoxarife);
        cozinheiro.pedirParaTrocarGas(atendente);

        Cozinheiro fabao = new Cozinheiro();
        fabao.lavarIngredientes();
        
        
    }
}