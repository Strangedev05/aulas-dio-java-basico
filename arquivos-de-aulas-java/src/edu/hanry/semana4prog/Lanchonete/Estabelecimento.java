package Lanchonete;

import Lanchonete.areaCliente.Cliente;
import Lanchonete.Atendimento.Atendente;
import Lanchonete.Atendimento.Cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();

        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();

        Atendente atendente = new Atendente();

        atendente.receberPagamento();
        atendente.sevirMesa();

        Cliente cliente = new Cliente();

        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
    }
}
