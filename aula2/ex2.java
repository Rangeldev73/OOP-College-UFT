public class ex2 {
    public static void main(String[] args){
        int numero1 = 130;
        int numero2 = 130;
        System.out.println(numero1==numero2);

        Integer numero0bj1 = 130;
        Integer numero0bj2 = 130;

        System.out.println(numero0bj1==numero0bj2);
        System.out.println(numero0bj1.equals(numero0bj2));
    }
}