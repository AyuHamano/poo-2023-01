package org.example.github.ayuhamano.t17.computadorCPU;

public class Computador {
    CPU cpu;
    Mouse mouse;
    Monitor monitor;
    PlacaMae placaMae;
    Teclado teclado;

    public Computador(CPU cpu, Monitor monitor, Mouse mouse, PlacaMae placaMae, Teclado teclado) {
        this.cpu = cpu;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
        this.placaMae= placaMae;
    }
}
