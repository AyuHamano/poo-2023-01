package org.example.github.ayuhamano.t18;

public class Main {
    public static void main(String[] args) {
        String jogadorBrancas = "Adolf Anderssen", jogadorPretas = "Lionel Kieseritzky";
        Partida partidaImortal = new Partida("Partida Imortal", jogadorBrancas, jogadorPretas);

        partidaImortal.adicionarLance(new Lance(jogadorBrancas, "e4", "e5"));
        partidaImortal.adicionarLance(new Lance(jogadorPretas, "f4", "exf4"));
        partidaImortal.adicionarLance(new Lance(jogadorBrancas,"Bc4", "Dh4+"));
        partidaImortal.adicionarLance(new Lance(jogadorPretas, "Rf1", "b5?!"));
        partidaImortal.adicionarLance(new Lance(jogadorBrancas,"Bxb5", "Cf6"));
        partidaImortal.adicionarLance(new Lance(jogadorPretas, "Cf3", "Dh6"));
        partidaImortal.adicionarLance(new Lance(jogadorBrancas,"d3", "Ch5"));
        partidaImortal.adicionarLance(new Lance(jogadorPretas, "Ch4", "Dg5"));
        partidaImortal.adicionarLance(new Lance(jogadorBrancas,"Cf5", "c6"));
        partidaImortal.adicionarLance(new Lance(jogadorPretas, "g4", "Cf6"));
        partidaImortal.adicionarLance(new Lance(jogadorBrancas,"Tg1!", "cxb5"));
        partidaImortal.adicionarLance(new Lance(jogadorPretas, "h4", "Dg6"));
        partidaImortal.adicionarLance(new Lance(jogadorBrancas,"h5", "Dg5"));
        partidaImortal.adicionarLance(new Lance(jogadorPretas, "Df3", "Cg8"));
        partidaImortal.adicionarLance(new Lance(jogadorBrancas,"Bxf4", "Df6"));
        partidaImortal.adicionarLance(new Lance(jogadorPretas, "Cc3", "Bc5"));
        partidaImortal.adicionarLance(new Lance(jogadorBrancas,"Cd5", "Dxb2"));
        partidaImortal.adicionarLance(new Lance(jogadorPretas, "Bd6!!", "Bxg1"));
        partidaImortal.adicionarLance(new Lance(jogadorBrancas,"e5", "Dxa1+"));
        partidaImortal.adicionarLance(new Lance(jogadorPretas, "Re2", "Ca6"));
        partidaImortal.adicionarLance(new Lance(jogadorBrancas,"Cxg7+", "Rd8"));
        partidaImortal.adicionarLance(new Lance(jogadorPretas, "Df6+", "Cxf6"));
        partidaImortal.adicionarLance(new Lance(jogadorBrancas,"Be7#", "1-0"));


        partidaImortal.imprimirPartida();

    }
}
