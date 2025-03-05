package ex8.Classes;

import ex8.Interface.TipoEntrega;

public class Pedido {
    public void pedidoEntrega(TipoEntrega tipoEntrega, String endereco){
        tipoEntrega.entrega(endereco);
    }
}
