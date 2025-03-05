package ex2;

public class Exerc2 {
    public static void main(String[] args) {
//      Implementando de Interface Torcedor
        Torcedor torcedor = new Corinthians();
        torcedor.torcer();

        torcedor = new Palmeiras();
        torcedor.torcer();
    }
}
