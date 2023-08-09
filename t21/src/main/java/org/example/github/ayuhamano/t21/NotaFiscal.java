package org.example.github.ayuhamano.t21;

import java.util.Set;

public class NotaFiscal {

    private Set<Pedido> contempla;
    private Colaborador atendente;
    private Set<Pagamento> pagamentos;

    public Preco total() {
        Preco soma = Preco.reais(0);
        for (Pagamento pagamento : pagamentos) {
            soma = soma.adiciona(pagamento.valor());
        }

        return soma;
    }
}
