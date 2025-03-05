package ex2;

public class Main {
    public static void main(String[] args) {
//      Implementando de Interface Torcedor
        Torcedor torcedor = new Corinthians();
        torcedor.torcer();

        torcedor = new Palmeiras();
        torcedor.torcer();
    }
}
