package Adapters;

import Classes.SistemaPagamentoNovo;
import Interfaces.Pagamento;

public class PagamentoAdapter implements Pagamento {

    private SistemaPagamentoNovo sistemaNovo;

    public PagamentoAdapter(SistemaPagamentoNovo sistemaNovo){
        this.sistemaNovo = sistemaNovo;
    }

    @Override
    public void cobrar(double valor) {
        sistemaNovo.processarPagamento(valor, "Pix");
    }
}
