package org.example.github.ayuhamano.t18;

public class Lance {
    String nomeJogador, origem, destino;

    public Lance(String nomeJogador, String origem, String destino) {
        this.nomeJogador = nomeJogador;
        this.origem = origem;
        this.destino = destino;
    }

    public String toStringLance() {
        return (
                nomeJogador
                + ": " + origem
                + " para " + destino
                + "\n"
        );
    }

}
