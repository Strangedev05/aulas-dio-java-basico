package edu.hanry.semana4prog;

public class SistemaIBGE {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
            //System.out.println(e.getSigla() + " - " + e.getNome());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.CEARA;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMauisculo());
        System.out.println(eb.getIbge());
    }
}
