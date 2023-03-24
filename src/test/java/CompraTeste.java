package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CompraTeste {
    @Test
    void deveExibirFormaPagamentoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Compra compra = new Compra(fabrica);
        assertEquals("CPF: 123.122.122-07", compra.ExibirDados());
    }

    @Test
    void deveExibirCpfPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Compra compra = new Compra(fabrica);
        assertEquals("Boleto", compra.metodoPagamento());
    }

    @Test
    void deveExibirFormaPagamentoPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Compra compra = new Compra(fabrica);
        assertEquals("CNPJ: 20.023.967/0001-04", compra.ExibirDados());
    }

    @Test
    void deveExibirCnpjPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Compra compra = new Compra(fabrica);
        assertEquals("Cartao Crédito", compra.metodoPagamento());
    }
}
