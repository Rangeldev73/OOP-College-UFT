package pilarpoo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("897897");

        Moto z400 = new Moto();
        z400.setChassi("467754");

        Automovel coringa = jeep;
        coringa.ligar();

        System.out.println("--------------------");

        coringa = z400;
        coringa.ligar(); 
    }
}
