package ex7;

import ex7.Classes.Boleto;
import ex7.Classes.CartaoCredito;
import ex7.Classes.Dinheiro;
import ex7.Classes.Venda;
import ex7.Interface.TipoPagamento;

public class Programa {
    public static void main(String[] args) {
        Venda venda = new Venda();

        TipoPagamento pagamento = new Boleto();
        venda.vender(pagamento,100.00);

        pagamento = new CartaoCredito();
        venda.vender(pagamento,100);

        pagamento = new Dinheiro();
        venda.vender(pagamento,100);

    }
}
