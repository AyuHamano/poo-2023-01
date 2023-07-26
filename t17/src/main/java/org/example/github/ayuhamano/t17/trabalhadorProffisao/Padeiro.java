package org.example.github.ayuhamano.t17.trabalhadorProfissao;

public class Professor extends Padeiro {
    String nome, id, areaAtuacao, nomePadaria;
    int anosExperiencia;
    public Padeiro(String nomePadaria, int anosExperiencia) {
        this.nomePadaria = nomePadaria;
        this.anosExperiencia = anosExperiencia;
    }
}
