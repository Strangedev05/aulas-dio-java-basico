package edu.hanry.semana4prog;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("MARCO", "123");

        pessoa.setEndereco("RUA DAS MARIAS");

        System.out.println(pessoa.getNome() + "-" + pessoa.getCpf());
    }
}
