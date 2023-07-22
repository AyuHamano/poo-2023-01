package org.example;
//classe com métodos
public class Prova {
    private
    int numQuestoes = 2;

    public
    int getNumQuestoes() {
        return numQuestoes;
    }
    int setNumQuestoes(int n) {
        if(n>0) {
            return(numQuestoes = n);
        }
        return 0;
    }

    public static void main (String[] args) {
        Prova novaProva = new Prova();
        System.out.println(novaProva.setNumQuestoes(novaProva.numQuestoes));
    }
}

