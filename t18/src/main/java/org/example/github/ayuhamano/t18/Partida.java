package org.example.github.ayuhamano.t18;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    String nome, jogadorBrancas, jogadorPretas;
    List <Lance> lances;

    public Partida(String nome, String jogadorBrancas, String jogadorPretas) {
        this.nome = nome;
        this.jogadorBrancas = jogadorBrancas;
        this.jogadorPretas = jogadorPretas;
        this.lances = new ArrayList<>();
    }

    public void adicionarLance(Lance lance) {
        lances.add(lance);
    }

    public void imprimirPartida() {
        System.out.println(
                "Nome da partida: " + this.nome + "\n"
                + "Jogadores: \n"
                + this.jogadorBrancas + " (Brancas) contra "
                + this.jogadorPretas + " (pretas)\n"
        );
        for(int i=0; i<23; i++) {
            System.out.println(i+1 + ". " + this.lances.get(i).toStringLance() + "\n");
        }
    }
}
