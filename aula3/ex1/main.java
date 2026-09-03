package aula3.ex1;

public class main {
    public static void Main(String[] args){
        SmartTV tv = new SmartTV();
        System.out.println("Status inicial: " + tv.getStatus());
        System.out.println("TV desligada");
        tv.aumentaC();
        tv.diminuiC();
        tv.onOff();
        System.out.println("Status atual: " + tv.getStatus());
        tv.aumentaC();
        tv.aumentaV();
    }
}