package edu.hanry.semana4prog.Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome ("Felipe");
        aluno.setIdade (8);

        System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos.");
    }
}
