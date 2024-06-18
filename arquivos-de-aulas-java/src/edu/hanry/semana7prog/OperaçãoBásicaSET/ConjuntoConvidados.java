package edu.hanry.semana7prog.OperaçãoBásicaSET;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codConvite) {
        convidadoSet.add(new Convidado(nome, codConvite));
    }

    public void removerCodConvidado(int codConvite) {
        Convidado removerCodigo = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodConvite() == codConvite) {
                removerCodigo = c;
            }
        }
        convidadoSet.remove(removerCodigo);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        //System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.removerCodConvidado(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados(s) dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
