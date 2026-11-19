package aula10.exercicio1;

public class ComputadorPedrinho {
    
    public static void main(String[] args) {
        /*System.out.println("MSNMESSENGER");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMsg();
        msn.receberMsg();
        System.out.println("--------------------------");
        System.out.println(("FACEBOOKMESSENGER"));
        FacebookMessenger fb = new FacebookMessenger();
        fb.enviarMsg();
        fb.receberMsg();
        System.out.println("--------------------------");
        System.out.println("TELEGRAM");
        Telegram telegram = new Telegram();
        telegram.enviarMsg();
        telegram.receberMsg();
        */
       ServicoMSGInstantanea smi = null;

       String appEscolhido="tlg";
        if(appEscolhido.equals("msn")) smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm")) smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg")) smi = new Telegram();

        smi.enviarMsg();
        smi.receberMsg();
    }
}
