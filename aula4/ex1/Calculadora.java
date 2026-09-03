package aula4.ex1;

/**
 * 
 * <h1>Calculadora</h1>
 * A calculadora faz operações matemáticas
 * @author Rangel
 * @version 1.0
 * @since 03/09/2026
 */
public class Calculadora {
    /**
     * Soma dois números
     * @param n1
     * @param n2
     * @return double: n1+n2
     */
    public double somar(double n1, double n2) {
        return n1+n2;
    }
    /**
     * Subtrai o primeiro pelo segundo
     * @param n1
     * @param n2
     * @return double: n1-n2
     */
    public double subtrair(double n1, double n2) {
        return n1-n2;
    }
    /**
     * Multiplica dois números
     * @param n1
     * @param n2
     * @return double: n1*n2
     */
    public double multiplicar(double n1, double n2) {
        return n1*n2;
    }
    /**
     * Divide o primeiro pelo segundo
     * @param n1
     * @param n2
     * @return double: n1/n2
     */
    public double dividir(double n1, double n2) {
        if(n2==0) return -1;
        return n1/n2;
    }
}
