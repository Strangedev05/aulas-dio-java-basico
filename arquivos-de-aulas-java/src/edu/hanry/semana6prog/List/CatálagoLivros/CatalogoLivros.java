package CatálagoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livroList.isEmpty()) {
    for (Livro l : livroList) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
            livrosPorAutor.add(l);
        }
    }
    return livrosPorAutor;
    } else {
        throw new RuntimeException("A lista está vazia!");
    }
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if (!livroList.isEmpty()) {
    for (Livro l : livroList) {
        if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
            livrosPorIntervaloAnos.add(l);
        }
    }
    return livrosPorIntervaloAnos;
    } else {
        throw new RuntimeException("A lista está vazia!");
    }
}

    public Livro pesquisarPorTitulo(String titulo) {
    Livro livroPorTitulo = null;
    if (!livroList.isEmpty()) {
        for (Livro l : livroList) {
        if (l.getTitulo().equalsIgnoreCase(titulo)) {
            livroPorTitulo = l;
            break;
        }
    }
    return livroPorTitulo;
    } else {
        throw new RuntimeException("A lista está vazia!");
    }
    }

    public static void main(String[] args) {
        CatalogoLivros catalagoLivros = new CatalogoLivros();
        catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalagoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalagoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalagoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalagoLivros.adicionarLivro("Livro 4", "Autor 4", 2024);
    
        //System.out.println(catalagoLivros.pesquisarPorAutor("Autor 2"));
        //System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
