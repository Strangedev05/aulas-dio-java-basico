package edu.hanry.semana5prog;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
            msn.enviarMensagem();;
            msn.receberMesagem();
        System.out.println(" ");
        System.out.println("FACEBOOK");
        FacebookMessenger fcb = new FacebookMessenger();
            fcb.enviarMensagem();;
            fcb.receberMesagem();
        System.out.println(" ");
        System.out.println("TELEGRAM");
        Telegram tlg = new Telegram();
            tlg.enviarMensagem();
            tlg.receberMesagem();
    }
}
