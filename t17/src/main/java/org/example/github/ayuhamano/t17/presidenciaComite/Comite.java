package org.example.github.ayuhamano.t17.presidenciaComite;

import java.util.ArrayList;
import java.util.List;

public class Comite {
    String nome;
    List<Pessoa> membros, presidentes;

    public Comite(String nome) {
        this.nome = nome;
        membros = new ArrayList<>();
        presidentes = new ArrayList<>(3);
    }
}
