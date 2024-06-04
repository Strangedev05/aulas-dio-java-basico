package edu.hanry.semana5prog.Apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMesagem();

    protected void validarConectadorInternet() {
        System.out.println("Validando conexão à internet");
    }
}
