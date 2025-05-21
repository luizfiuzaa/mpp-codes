package Classes;
import Interfaces.ComponenteInventario;

public class Item implements ComponenteInventario {
    private String nome;
    private double peso;
    private int quantidade;

    public Item(String nome, double peso, int quantidade) {
        this.nome = nome;
        this.peso = peso;
        this.quantidade = quantidade;
    }

    @Override
    public void exibir() {
        System.out.println("Item: " + nome + ", Peso: " + peso + "kg, Quantidade: " + quantidade);
    }

    @Override
    public double getPesoTotal() {
        return peso * quantidade;
    }
}