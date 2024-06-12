package AtividadesLIST.CarrinhoCompras;

public class Compra {
    private String nome;
    private double preco;
    private int quant;

    public Compra(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuant() {
        return quant;
    }

    public String toString() {
        return "Compra{" + 
                            "nome='" + nome + '\'' +
                            ", preco=" + preco +
                            ", quant=" + quant +
                            '}';
    }
}
