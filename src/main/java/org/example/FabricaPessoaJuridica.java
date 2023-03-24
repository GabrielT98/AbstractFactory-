package org.example;

public class FabricaPessoaJuridica implements FabricaAbstrata{
    @Override
    public FormaPagamento createFormaPagamento() {
        return new CartaoCredito();
    }

    @Override
    public Pessoa createPessoa() {
        return new PessoaJuridica();
    }
}
