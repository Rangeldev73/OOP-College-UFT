public class ex1 {
    
    public static void main(String[] args){
        String primeiroNome = "Joaquim";
        String segundoNome = "Rangel";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}