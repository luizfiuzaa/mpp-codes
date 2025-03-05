package ex5;

public class Forno {
    public void fabricar(Pizza pizza){
        pizza.preparar();
        pizza.assar();
        pizza.cobrar();
    }
}
