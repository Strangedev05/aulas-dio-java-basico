package edu.hanry.semana7prog.Map.OperaçõesBásicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroContato = null;
        if(!agendaContatosMap.isEmpty()) {
            numeroContato = agendaContatosMap.get(nome);
        }
        return numeroContato;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Hanry", 123456);
        agendaContatos.adicionarContato("Hanry", 5665);
        agendaContatos.adicionarContato("Hanry José", 111111);
        agendaContatos.adicionarContato("Hanry Araújo", 12549);
        agendaContatos.adicionarContato("Hanry Souza", 111111);
        agendaContatos.adicionarContato("Hanry", 635294);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Hanry Souza");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Hanry Araújo"));
    }
}
