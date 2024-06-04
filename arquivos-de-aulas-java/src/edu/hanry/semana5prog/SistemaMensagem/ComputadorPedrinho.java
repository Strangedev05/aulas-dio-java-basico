package edu.hanry.semana5prog.SistemaMensagem;

import edu.hanry.semana5prog.SistemaMensagem.Apps.FacebookMessenger;
import edu.hanry.semana5prog.SistemaMensagem.Apps.MSNMessenger;
import edu.hanry.semana5prog.SistemaMensagem.Apps.ServicoMensagemInstantanea;
import edu.hanry.semana5prog.SistemaMensagem.Apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "fbm";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMesagem();
    }
}
