package ex7.Classes;

import ex7.Interface.TipoPagamento;

public class Venda{
    public void vender(TipoPagamento formaPagamento, double valor) {
        formaPagamento.pagar(valor);
    }
}
