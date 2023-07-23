package org.example.github.ayuhamano.t13;

public class Ayumi {
    String nome, curso, matricula;
    Disciplina disciplinaQueAyumiCursa;
    float nota;

    public
    Ayumi(String nome, String matricula, String curso, Disciplina disciplina, float nota) {
        this.curso = curso;
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinaQueAyumiCursa = disciplina;
        this.nota = nota;
    }
    void imprimeAyumi() {
        System.out.println(
                "Nome: " + this.nome + "\n" +
                "Matrícula: " + this.matricula + "\n" +
                "Curso: " + this.curso + "\n" +
                "Disciplina: " + this.disciplinaQueAyumiCursa.nome +
                "Professor atual: " + this.disciplinaQueAyumiCursa.professor +
                "Nota: " + this.nota
        );
    }

    public static void main(String[] args) {
        Disciplina poo = new Disciplina();
        poo.professor = "Fábio Nogueira";
        poo.nome = "Programação Orientada a Objetos";
        Ayumi aline = new Ayumi("Aline Ayumi", "202208016", "ES", poo, 10);

        aline.imprimeAyumi();

    }
}
