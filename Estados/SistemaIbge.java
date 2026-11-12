package Estados;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.err.println(e.getSigla()+"-"+e.getName());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.TOCANTINS;

        System.out.println(eb.getName());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNameMaiusculo());
    }
}
