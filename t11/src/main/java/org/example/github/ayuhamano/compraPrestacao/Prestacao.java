package org.example.github.ayuhamano.compraPrestacao;

import java.util.Date;

public class Prestacao {
    float valor;
    Date dataCompra;

    public Prestacao(float valor, Date dataCompra) {
        this.dataCompra = dataCompra;
        this.valor = valor;
    }
}
