package edu.hanry.semana5prog.Equipamentos.MultiFuncional;

import edu.hanry.semana5prog.Equipamentos.Copiadora.Copiadora;
import edu.hanry.semana5prog.Equipamentos.Digitalizadora.Digitalizadora;
import edu.hanry.semana5prog.Equipamentos.Impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora{
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void imprimir() {
        System.out.println("IMRPIMINDO VIA EQUIPAMENTO MULTIFIUNCIONAL");
    }
}
