public class Estudante extends Pessoa{
    
    private String matricula;
    private double nota1;
    private double nota2;
    private double media;

    public Estudante(String nome, int idade, String cpf, char genero, String matricula,  double nota1, double nota2){
        super(nome,idade,cpf,genero);
        this.matricula = matricula;
        this.nota1 = validarNota(nota1);
        this.nota2 = validarNota(nota2);
        this.media = calcularMedia(this.nota1,this.nota2);
    }

    public String getMatricula(){
        return this.matricula;
    }

    public double getNota1(){
        return this.nota1;
    }

    public double getNota2(){
        return this.nota2;
    }

    public double getMedia(){
        return this.media;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setNota1(double nota1){
        this.nota1 = validarNota(nota1);
        this.media = calcularMedia(this.nota1, this.nota2);
    }

    public void setNota2(double nota2){
        this.nota2 = validarNota(nota2);
        this.media = calcularMedia(this.nota1, this.nota2);
    }

    public static double calcularMedia(double nota1, double nota2){
        return (nota1+nota2)/2;
    }

    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Matricula: "+ this.matricula);
        System.out.println("Nota 1: "+ this.nota1);
        System.out.println("Nota 2: "+ this.nota2);
        System.out.println("Média: "+ this.media);
    }

    public static double validarNota(double nota){
        if(nota>10 || nota<0){
           System.out.println("Aviso: Nota " + nota + " é inválida! Ajustada para 0.0.");
            return 0.0;
        }
        return nota;
    }
}