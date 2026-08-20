public class ex1 {
    public static void main(String[] args){
        short shortNumber = 1;
        System.out.println(shortNumber);
        int normalNum = shortNumber;
        System.out.println(normalNum);

        //short shortNumber2 = normalNum;erro

        final double VALOR_DE_PI = 3.14;
        //VALOR_DE_PI=3.15;
        System.out.println(VALOR_DE_PI);

        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        concatenacao = 1+"1"+1+1;
        concatenacao = 1+"1"+1+"1";
        concatenacao = "1"+1+1+1;
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        String nome1 = "JAVA";
        String nome2 = "JAVA";

        System.out.println(nome1 == nome2);

        String nome3 = new String("JAVA");

        System.out.println(nome1==nome3);
        System.out.println(nome1.equals(nome3));
        String nome4 = nome3;

        System.out.println(nome3==nome4);
    }
}