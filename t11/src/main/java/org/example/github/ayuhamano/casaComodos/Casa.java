package org.example.github.ayuhamano.casaComodos;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private
    List<Areas> area;
    List <Banheiro> banheiros;
    List <Garagem> garagems;
    List <Quarto> quartos;
    List <Salas> salas;

    public Casa() {
        area = new ArrayList<>();
        banheiros = new ArrayList<>();
        garagems = new ArrayList<>();
        quartos = new ArrayList<>();
        salas = new ArrayList<>();
    }

}
