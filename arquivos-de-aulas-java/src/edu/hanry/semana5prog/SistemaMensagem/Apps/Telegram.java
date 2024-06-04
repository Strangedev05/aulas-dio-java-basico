package edu.hanry.semana5prog.SistemaMensagem.Apps;

public class Telegram extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadorInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }
    public void receberMesagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
