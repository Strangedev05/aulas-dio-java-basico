package edu.hanry.semana6prog.AtividadesLIST;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Compra> compraList;

    public CarrinhoDeCompras() {
        this.compraList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quant) {
        Compra compra = new Compra(nome, preco, quant);
        this.compraList.add(compra);
    }

    public void removerCompra(String nome, double preco, int quant) {
        List<Compra> compraParaRemover = new ArrayList<>();
        if (!compraList.isEmpty()) {
            for (Compra c : compraList) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    compraParaRemover.add(c);
                }
            }
            compraList.removeAll(compraParaRemover);
        } else {
            System.out.println("A lista de compras está vazia!");
        }
    }

  public double calcularValorTotal() {
    double valorTotal = 0d;
    if (!compraList.isEmpty()) {
      for (Compra item : compraList) {
        double valorItem = item.getPreco() * item.getQuant();
        valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
      }
      return valorTotal;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

    public void exibirCompras() {
        if (!compraList.isEmpty()) {
            System.out.println(this.compraList);
        } else {
            System.out.println("A lista de compras está vazia!");
        }
    }

    public String toString() {
        return "CarrinhoDeCompras{" + 
            "compras=" + compraList + 
            '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        carrinhoDeCompras.exibirCompras();

        carrinhoDeCompras.removerCompra("Lápis", 0, 0);

        carrinhoDeCompras.exibirCompras();

        System.out.println("O valor total da compra é: " + carrinhoDeCompras.calcularValorTotal());
    }
}
