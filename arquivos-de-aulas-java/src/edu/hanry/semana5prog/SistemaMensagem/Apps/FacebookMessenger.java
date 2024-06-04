package edu.hanry.semana5prog.SistemaMensagem.Apps;

public class FacebookMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        validarConectadorInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }
    public void receberMesagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }
}
