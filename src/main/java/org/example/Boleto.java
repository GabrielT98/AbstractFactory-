package org.example;

public class Boleto implements FormaPagamento{

    @Override
    public String metodoPagamento() {
        return "Boleto";
    }
}
