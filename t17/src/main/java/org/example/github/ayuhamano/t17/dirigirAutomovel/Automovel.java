package org.example.github.ayuhamano.t17.dirigirAutomovel;

import java.util.ArrayList;
import java.util.List;

public class Automovel {
    String marca, modelo;

    int ano;
    List <Pessoa> motoristas;

    public Automovel() {
        this.motoristas = new ArrayList<>();
    }
}
