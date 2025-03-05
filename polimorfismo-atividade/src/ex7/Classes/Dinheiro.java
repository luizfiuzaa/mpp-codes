package ex7.Classes;

import ex7.Interface.TipoPagamento;

public class Dinheiro implements TipoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento em Dinheiro. Não tem Taxa! ");
    }
}
