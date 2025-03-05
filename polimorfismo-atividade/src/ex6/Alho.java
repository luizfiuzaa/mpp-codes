package ex6;

public class Alho implements Pizza{
    @Override
    public void preparar() {
        System.out.println("molho, queijo, cebola, alho");
    }

    @Override
    public void assar() {
        System.out.println("12 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$ 12.00");
    }

    public void bordaEspecial() {}
}
