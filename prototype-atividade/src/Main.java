import Classes.Inimigo;

public class Main {
    public static void main(String[] args) {
        Inimigo inimigo = new Inimigo("Headman", 250, 100, 5000);

        Inimigo inimigo1 = (Inimigo) inimigo.clone();
        Inimigo inimigo2 = (Inimigo) inimigo.clone();
        Inimigo inimigo3 = (Inimigo) inimigo.clone();

        inimigo1.setValorRecompensa(2000);
        inimigo2.setValorRecompensa(7000);
        inimigo3.setValorRecompensa(3000);

        inimigo1.atacar();
        inimigo1.morrer();
    }
}