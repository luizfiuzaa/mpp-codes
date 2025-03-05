package ex4.v2;

public class Forno {
    public void fabricar(PizzaCalabresa calabresa){
        calabresa.preparar();
        calabresa.assar();
        calabresa.cobrar();
    }
    public void fabricar(PizzaNapolitana napolitana){
        napolitana.preparacao();
        napolitana.assamento();
        napolitana.valor();
    }
}
