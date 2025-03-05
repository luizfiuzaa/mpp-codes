package ex6;

public class Forno {
    public void fabricar(Pizza pizza, boolean especial){
        pizza.preparar();
        if (especial){
            pizza.bordaEspecial();
            System.out.println("Borda de catupiry");
        }
        pizza.assar();
        pizza.cobrar();
    }
}
