package pilarpoo;

public class Carro {
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

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
