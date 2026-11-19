package aula10.exercicio1;

public class Telegram extends ServicoMSGInstantanea {
    @Override
    public void enviarMsg() {
        System.out.println("ENVIANDO MSG PELO TELEGRAM!");
    }

    @Override
    public void receberMsg() {
        System.out.println("RECEBENDO MSG PELO TELEGRAM!");
    }
}
