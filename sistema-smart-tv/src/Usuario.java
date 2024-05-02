public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTv = new SmartTV();
        
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumertarVolume();

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Volume Atual: " + smartTv.vol);
        
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.vol);
        
        smartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
    }
}
