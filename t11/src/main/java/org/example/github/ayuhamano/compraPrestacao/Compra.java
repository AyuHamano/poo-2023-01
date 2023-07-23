package org.example.github.ayuhamano.compraPrestacao;

import java.util.List;

public class Compra {
    List <ItemCompra> itensComprados;
    Carne carne;

    public Compra(List itensComprados, Carne carne) {
        this.carne = carne;
        this.itensComprados = itensComprados;

    }
}
