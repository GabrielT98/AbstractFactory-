package org.example;

public class FabricaPessoaFisica implements FabricaAbstrata{

    @Override
    public FormaPagamento createFormaPagamento() {
        return new Boleto();
    }

    @Override
    public Pessoa createPessoa() {
        return new PessoaFisica();

    }
}
