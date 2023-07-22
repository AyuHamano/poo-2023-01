package org.example.github.ayuhamano.armarioPrateleira;

import java.util.ArrayList;
import java.util.List;

public class Compartimento {
    List<Livro> livros;
    List<CD> cds;

    public Compartimento() {
        this.cds = new ArrayList<>(7);
        this.livros = new ArrayList<>(3);
    }
}
