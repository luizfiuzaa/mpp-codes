package ex1;

public class Exerc1 {
    public static void main(String[] args) {
//      Extendendo de Classe Torcedor
        Torcedor torcedor = new Torcedor();
        torcedor.torcer();

        torcedor = new Palmeiras();
        torcedor.torcer();

        torcedor = new Santos();
        torcedor.torcer();

        torcedor = new Corinthians();
        torcedor.torcer();
    }
}