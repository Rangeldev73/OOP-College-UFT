package aula10.exercicio1;

public class FacebookMessenger extends ServicoMSGInstantanea {
    @Override
    public void enviarMsg() {
        System.out.println("ENVIANDO MSG PELO FACEBOOK!");
    }

    @Override
    public void receberMsg() {
        System.out.println("RECEBENDO MSG PELO FACEBOOK!");
    }
}
