package org.example.github.ayuhamano.t08.empresaSalario;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private
    List<Emprego> empregos;

    /*todo mundo vai ter acesso aos empregos dessa classe*/
    public
    List<Pessoas> empregados;

    Empresa() {
        empregos = new ArrayList<>();
    }
}
