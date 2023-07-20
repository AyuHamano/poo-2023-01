package org.example.Github.AyuHamano.t08.escolaEndereco.arquivoPermissao;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    String nomeGrupo;
    List <Usuarios> usuariosGrupo;
    List <Permissao> permissoes;
    Grupo(String nomeGrupo) {
        this.nomeGrupo=nomeGrupo;
        this.usuariosGrupo = new ArrayList<>();
        this.permissoes = new ArrayList<>();
    }

}
