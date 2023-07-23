package org.example.github.ayuhamano.lanchoneteFuncionario;

import java.util.ArrayList;
import java.util.List;

public class Lanchonete {
    String nome, cnpj;
    Funcionario gerente;
    List <Funcionario> funcionarios;

    public Lanchonete(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
    }
}
