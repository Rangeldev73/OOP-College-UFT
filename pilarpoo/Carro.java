package pilarpoo;

public class Carro extends Automovel {

    @Override
    public void ligar() {
        confereCombustivel();
        conferindoCambio();
        System.out.println("Carro LIGADO");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustível");
    }

    private void conferindoCambio() {
        System.out.println("Câmbio no P ta ok");
    }
}
