package ex4.v2;

public class Programa {
    public static void main(String[] args) {
        Forno forno = new Forno();
        PizzaCalabresa calabresa = new PizzaCalabresa();

        forno.fabricar(calabresa);

        PizzaNapolitana napolitana = new PizzaNapolitana();
        forno.fabricar(napolitana);
    }
}
