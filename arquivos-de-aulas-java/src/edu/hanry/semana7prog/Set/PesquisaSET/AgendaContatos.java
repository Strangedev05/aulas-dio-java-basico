package edu.hanry.semana7prog.Set.PesquisaSET;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exebirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarNome(String nome) {
        Set<Contato> contatosNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosNome.add(c);
            }
        }
        return contatosNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        //agendaContatos.exebirContato();

        agendaContatos.adicionarContato("Hanry", 123456);
        agendaContatos.adicionarContato("Hanry", 0);
        agendaContatos.adicionarContato("Hanry José", 111111);
        agendaContatos.adicionarContato("Hanry Araújo", 642589);
        agendaContatos.adicionarContato("Hanry Souza", 111111);

        agendaContatos.exebirContato();

        System.out.println(agendaContatos.pesquisarNome("Hanry"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Hanry Souza", 40028922));
    
        agendaContatos.exebirContato();
    }
}
