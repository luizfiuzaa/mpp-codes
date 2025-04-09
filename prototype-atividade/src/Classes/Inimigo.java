package Classes;

import Interfaces.Prototipo;

public class Inimigo implements Prototipo {

    public String nome;
    public double vida;
    public double dano;
    public double valorRecompensa;

    public Inimigo(String nome, double vida, double dano, double valorRecompensa){
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.valorRecompensa = valorRecompensa;
    }

    @Override
    public Prototipo clone() {
        System.out.println("Clonando Inimigo");
        return new Inimigo(this.nome, this.vida, this.dano, this.valorRecompensa);
    }

    public void setValorRecompensa(double valor){
        this.valorRecompensa = valor;
    }

    public void atacar(){
        System.out.println(this.nome + " atacou o jogador, e deu " + this.dano + " pontos de dano");
    }

    public void morrer(){
        System.out.println( this.nome + " morreu e deixou um Orbe de $ " + this.valorRecompensa);
    }
}
