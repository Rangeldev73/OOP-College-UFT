package aula10.exercicio1;

public class MSNMessenger extends ServicoMSGInstantanea {

    @Override 
    public void enviarMsg() {
        System.out.println("ENVIANDO MSG PELO MSN!");
    }

    @Override 
    public void receberMsg() {
        System.out.println("RECEBENDO MSG PELO MSN!");
    }
}
