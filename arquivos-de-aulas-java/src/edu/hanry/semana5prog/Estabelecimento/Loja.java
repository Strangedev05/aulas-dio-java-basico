package edu.hanry.semana5prog.Estabelecimento;

import edu.hanry.semana5prog.Equipamentos.Copiadora.Copiadora;
import edu.hanry.semana5prog.Equipamentos.Digitalizadora.Digitalizadora;
import edu.hanry.semana5prog.Equipamentos.Digitalizadora.Scanner;
import edu.hanry.semana5prog.Equipamentos.Impressora.Deskjet;
import edu.hanry.semana5prog.Equipamentos.Impressora.Impressora;
import edu.hanry.semana5prog.Equipamentos.Impressora.Laserjet;
import edu.hanry.semana5prog.Equipamentos.MultiFuncional.EquipamentoMultiFuncional;

public class Loja {
    public static void main(String[] args) {
        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();

        Scanner scanner = new Scanner();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
        
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
