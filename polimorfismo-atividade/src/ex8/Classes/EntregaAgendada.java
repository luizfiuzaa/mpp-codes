package ex8.Classes;

import ex8.Interface.TipoEntrega;

public class EntregaAgendada implements TipoEntrega {
    @Override
    public void entrega(String localizacao) {
        System.out.println("Entrega Agendada em "+ localizacao);
    }
}
