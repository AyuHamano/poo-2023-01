package org.projetoLinguagem;

public class LinguagemProgramacao {
    String nome, implementacao;

    public LinguagemProgramacao (String nome, String implementacao) {
        this.nome = nome;
        this.implementacao = implementacao;
    }
    public String toString() {
        return "\n nome: " + nome + "\n implementacao: " + implementacao;
    }
}
