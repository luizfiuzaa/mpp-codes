package ex8;

import ex8.Classes.EntregaAgendada;
import ex8.Classes.EntregaPadrao;
import ex8.Classes.EntregaRapida;
import ex8.Classes.Pedido;
import ex8.Interface.TipoEntrega;

public class Programa {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        TipoEntrega entrega = new EntregaPadrao();
        pedido.pedidoEntrega(entrega, "Paper St.");

        entrega = new EntregaAgendada();
        pedido.pedidoEntrega(entrega, "Fenda do Biquini");

        entrega = new EntregaRapida();
        pedido.pedidoEntrega(entrega, "Bar do Zé Caboclo");
    }
}
