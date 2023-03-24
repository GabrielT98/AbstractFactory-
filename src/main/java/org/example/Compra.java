package org.example;

public class Compra {
    private Pessoa pessoa;
    private FormaPagamento formaPagamento;

    public Compra (FabricaAbstrata fabrica) {
        this.pessoa = fabrica.createPessoa();
        this.formaPagamento = fabrica.createFormaPagamento();
    }

    public String ExibirDados() {
        return this.pessoa.exibirDados();
    }

    public String metodoPagamento() {
        return this.formaPagamento.metodoPagamento();
    }
}
