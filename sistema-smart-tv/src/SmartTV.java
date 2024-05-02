public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int vol = 25;

    public void ligar(){
        ligada = true;   
    }
    public void desligar(){
        ligada = false;
    }
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void subirCanal(){
        canal++;
    }
    public void baixarCanal(){
        canal--;
    }
    public void aumertarVolume(){
        vol++;
        System.out.println("Aumentando o volume para: " + vol);
    }
    public void diminuirVolume(){
        vol--;
        System.out.println("Diminuindo o volume para: " + vol);
    }
}