package org.TextoParagrafo;

import java.util.ArrayList;
public class Texto {
    ArrayList<Paragrafo> paragrafos;
    public void Texto (ArrayList<Paragrafo> paragrafos) {
        this.paragrafos = paragrafos;
    }
    public static void main(String[] args) {
        System.out.println("Aqui está seu Texto");
    }
}
