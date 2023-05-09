package atributos_metodos;
//classe com atributos e duas associações em ela mesma
public class Pessoa {
    private :
    Data nascimento;
    String nome;
    Pessoa mae, pai;
}
//classe com métodos
public class Prova {
    private :
    byte numQuestoes;

    public :
    byte getNumQuestoes() {
        return numQuestoes;
    }
    void setNumQuestoes(byte n) {
        if(n>0) {
            numQuestoes = n;
        }
    }
}

