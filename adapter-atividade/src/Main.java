import Adapters.PagamentoAdapter;
import Classes.SistemaPagamento;
import Classes.SistemaPagamentoNovo;

public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();
        sistema.cobrar(100);

        SistemaPagamentoNovo sistemaNovo = new SistemaPagamentoNovo();
        PagamentoAdapter adapter = new PagamentoAdapter(sistemaNovo);
        adapter.cobrar(150);
    }
}