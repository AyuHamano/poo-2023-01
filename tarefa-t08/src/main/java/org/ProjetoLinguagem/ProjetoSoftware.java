package org.projetoLinguagem;

import java.util.ArrayList;

public class ProjetoSoftware {
        String nome, data;
        ArrayList<LinguagemProgramacao> linguagensProgramacao = new ArrayList<>();

        public ProjetoSoftware adicao () {
            ProjetoSoftware p = new ProjetoSoftware();
            p.nome = "Sisconjur";
            p.data = "02/06/2023";
            p.linguagensProgramacao.add(new LinguagemProgramacao("TypeScript", "interpretada"));
            p.linguagensProgramacao.add(new LinguagemProgramacao("JavaScript", "interpretada"));
            p.linguagensProgramacao.add(new LinguagemProgramacao("SQL", "compilada"));
            return p;
        }
        public String toString() {
            return "\n nome: " + nome + "\n data de início: " + data + "\n Linguagens de Programação: " + linguagensProgramacao;
        }
        public void imprimeProjeto () {
            ProjetoSoftware p = adicao();
            System.out.println(p);
        }
        public static void main (String[] args) {
            ProjetoSoftware p = new ProjetoSoftware();
            p.imprimeProjeto();
        }

}
