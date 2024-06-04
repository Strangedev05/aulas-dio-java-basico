package edu.hanry.semana5prog;

public class ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviar mensagem");
        salvarHistoricoMEnsagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMEnsagem() {
        System.out.println("Salvando o histórico de mensagem");
    }
}
