package ex7.Classes;

import ex7.Interface.TipoPagamento;

public class CartaoCredito implements TipoPagamento {
    @Override
    public void pagar(double valor) {
        double taxa = valor * 0.2;
        System.out.println("Pagamento em Cartão de Crédito. Taxa de "+taxa);
    }
}
