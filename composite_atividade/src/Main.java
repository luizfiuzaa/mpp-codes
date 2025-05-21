import Classes.Item;
import Classes.Mochila;
import Interfaces.ComponenteInventario;

public class Main {
    public static void main(String[] args) {
        ComponenteInventario comida = new Item("Ração", 0.5, 3);
        ComponenteInventario ferramenta = new Item("Machado", 2.0, 1);
        ComponenteInventario mochilaPequena = new Mochila("Mochila Secundária");
        mochilaPequena.adicionar(comida);

        ComponenteInventario mochilaPrincipal = new Mochila("Mochila de Sobrevivência");
        mochilaPrincipal.adicionar(ferramenta);
        mochilaPrincipal.adicionar(mochilaPequena);

        System.out.println("Conteúdo do inventário:");
        mochilaPrincipal.exibir();
        System.out.println("Peso total do inventário: " + mochilaPrincipal.getPesoTotal() + "kg");
    }
}