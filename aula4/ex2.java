package aula4;

/**
 * Classe responsável por operações matemáticas da aula 4.
 */
public class ex2 {

/**
     * Soma ou multiplica dois números dependendo da String de entrada.
     * Caso a String seja "M" ele multiplicará, caso contrário ele somará os dois números.
     * 
     * @param n Primeiro número inteiro
     * @param x Segundo número inteiro
     * @param m String de controle ("M" para multiplicar, qualquer outra para somar)
     * @return O resultado da operação
     */
    public int somaMultiplica (int n, int x, String m) {
        return "M".equals(m) ? n*x : n+x;
    }
}