package org.example.Github.AyuHamano.t08.escolaEndereco.arquivoPermissao;

import java.util.ArrayList;
import java.util.List;

public class Arquivo {
    String nome, tipo;
    List <Permissao> permissoesArquivo;

    Arquivo(String nome, String tipo){
        this.permissoesArquivo = new ArrayList<Permissao>();
        this.nome=nome;
        this.tipo=tipo;
    }
}
