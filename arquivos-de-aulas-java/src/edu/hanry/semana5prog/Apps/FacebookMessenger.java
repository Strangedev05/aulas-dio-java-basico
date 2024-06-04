package edu.hanry.semana5prog.Apps;

public class FacebookMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        validarConectadorInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }
    public void receberMesagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }
}
