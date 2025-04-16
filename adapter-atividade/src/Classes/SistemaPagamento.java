package Classes;

import Interfaces.Pagamento;

public class SistemaPagamento implements Pagamento {
    @Override
    public void cobrar(double valor) {
        System.out.println("Cobrança de R$ "+ valor +" realizada por boleto");
    }
}
