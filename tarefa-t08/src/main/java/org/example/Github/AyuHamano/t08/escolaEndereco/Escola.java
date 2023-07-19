package org.escolaEndereco;

public class Escola {
    String nome;
    Number quantidadeAluno;
    Endereco EnderecoEscola;

    public String toString() {
        return " nome: " + nome + "\n quantidadeAluno: " + quantidadeAluno + "\n EnderecoEscola: " + EnderecoEscola;
    }
    public static void main(String[] args) {
        Escola escola = new Escola();
        String cep = "74691-865";
        escola.nome = "Aline";
        escola.quantidadeAluno = 200;
        escola.EnderecoEscola = new Endereco(cep);
        System.out.println(escola);
    }
}
