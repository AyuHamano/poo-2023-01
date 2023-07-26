package org.example.github.ayuhamano.t17.trabalhadorProfissao;

public class Professor extends Profissao {
    String nome, id, areaAtuacao, materiaAdm, nomeInstituicao, nivelEscolaridade, graduacao;
    int numOAB;
    public Professor(String materiaAdm) {
        this.materiaAdm = materiaAdm;
    }
}
