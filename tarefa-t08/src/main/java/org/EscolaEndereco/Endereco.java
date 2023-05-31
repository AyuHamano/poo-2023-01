package org.EscolaEndereco;

public class Endereco {
    String cep, rua, bairro;
    Number numero;

    public Endereco(String cep) {
        this.cep = cep;
        this.rua = "AB-13";
        this.bairro = "Alice Barbosa";
        this.numero = 30;
        System.out.println("Endereço adicionado");
    }
    public String toString() {
        return "\n cep: " + cep + "\n rua: " + rua + "\n bairro: " + bairro + "\n numero: " + numero;
    }
}
