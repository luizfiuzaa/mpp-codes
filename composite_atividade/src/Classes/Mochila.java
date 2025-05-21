package Classes;
import Interfaces.ComponenteInventario;
import java.util.ArrayList;
import java.util.List;

public class Mochila implements ComponenteInventario {
    private String nome;
    private List<ComponenteInventario> componentes;

    public Mochila(String nome) {
        this.nome = nome;
        this.componentes = new ArrayList<>();
    }

    public void adicionar(ComponenteInventario componente) {
        componentes.add(componente);
    }

    @Override
    public void exibir() {
        System.out.println("Mochila: " + nome);
        for (ComponenteInventario componente : componentes) {
            componente.exibir();
        }
    }

    @Override
    public double getPesoTotal() {
        double pesoTotal = 0;
        for (ComponenteInventario componente : componentes) {
            pesoTotal += componente.getPesoTotal();
        }
        return pesoTotal;
    }
}
