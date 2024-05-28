package Lanchonete.areaCliente;

public class Cliente {
    public void escolherLanche() {
        System.out.println("ESCOLHENDO O LANCHE");
    }
    public void fazerPedido() {
        System.out.println("FAZENDO O PEDIDO");
    }
    public void pagarConta() {
        consultarSaldodoAplicativo();
        System.out.println("PAGANDO A CONTA");
    }
    private void consultarSaldodoAplicativo() {
        System.out.println("CONSULTANDO SALDO NO APLICATIVO");
    }
}
