package edu.hanry.semana5prog.Apps;

public class MSNMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadorInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }
    public void receberMesagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }
} 
