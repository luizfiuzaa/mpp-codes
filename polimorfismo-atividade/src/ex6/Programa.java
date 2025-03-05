package ex6;

public class Programa {
    public static void main(String[] args) {
        Forno forno = new Forno();

        Pizza pizza = new Calabresa();
        forno.fabricar(pizza, false);

        pizza = new Bacon();
        forno.fabricar(pizza, true);

        pizza = new Alho();
        forno.fabricar(pizza, false);

        pizza = new Napolitana();
        forno.fabricar(pizza,true);

    }
}
