package org.example.github.ayuhamano.compraPrestacao;

import java.util.ArrayList;
import java.util.List;

public class ItemCompra {
    int qtdTotal;
    List<Produto> produtosComprados;

    public ItemCompra() {
        this.produtosComprados = new ArrayList<>();
    }
}
