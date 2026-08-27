package aula3.ex1;
/**
 * @author SeuNome
 * @since 27/08/2026
 */
public class SmartTV {
    
    private boolean ligada;
    private int canal;
    private int volume;

    private final int vMaximo = 10;
    private final int cMaximo = 15;

    public SmartTV(){
        ligada = false;
        canal = 1;
        volume = 5;
    }

    public void onOff(){
        ligada = !ligada;
        if(ligada){
            System.out.println("TV ligada");
            return;
        }
        System.out.println("TV desligada");
        return;
    }

    public int aumentaV(){
        if(!ligada){
            System.out.println("TV desligada");
            return -1;
        }
        if(volume==vMaximo){
            System.out.println("Volume já no máximo");
            return volume;
        }
        volume++;
        return volume;
    }

    public int diminuiV(){
        if(!ligada){
            System.out.println("TV desligada");
            return -1;
        }
        if(volume==0){
            System.out.println("Volume já no mínimo");
            return volume;
        }
        volume--;
        return volume;
    }

    public int aumentaC(){
        if(!ligada){
            System.out.println("TV desligada");
            return -1;
        }
        if(canal==cMaximo){
            System.out.println("Maior canal já escolhido");
            return canal;
        }
        canal++;
        return canal;
    }

    public  int diminuiC(){
        if(!ligada){
            System.out.println("TV desligada");
            return -1;
        }
        if(canal==1){
            System.out.println("Menor canal já escolhido");
            return canal;
        }
        canal--;
        return canal;
    }

    public int escolherC(int c){
        if(!ligada){
            System.out.println("TV desligada");
            return -1;
        }
        if(c>cMaximo||c<1){
            System.out.println("Número invalido, escolha entre 1 e 15");
            return canal;
        }
        canal=c;
        return canal;
    }

    public int getCanal(){
        return canal;
    }

    public int getVolume(){
        return volume;
    }

    public boolean getStatus(){
        return ligada;
    }
}
