package ex7.Classes;

import ex7.Interface.TipoPagamento;

public class Boleto implements TipoPagamento {
    @Override
    public void pagar(double valor) {
         double taxa = 0.80;
         System.out.println("Pagamento em Boleto. Taxa fixa R$ "+taxa);
    }
}
