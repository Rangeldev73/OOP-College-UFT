package Estados;

public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piauí"),
    MARANHAO ("MA", "Maranhão"),
    TOCANTINS ("TO", "Tocantins");
    
    private String name;
    private String sigla;

    private EstadoBrasileiro(String sigla, String name) {
        this.sigla = sigla;
        this.name = name;
    }

    public String getSigla() {
        return sigla;
    }

    public String getName() {
        return name;
    }
    
    public String getNameMaiusculo() {
        return name.toUpperCase();
    }
}
