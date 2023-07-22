package org.example.github.ayuhamano.janelasVidro;

public class JanelaVidro implements Janela,Vidro {
    int vidroLado, vidroArea, janelaLado, janelaArea;

    @Override
    public int janelaArea() {
        this.janelaArea = janelaLado * janelaLado;
        return janelaArea;
    }

    @Override
    public int vidroArea() {
        this.vidroArea = vidroLado * vidroLado;
        return vidroArea;
    }
}
