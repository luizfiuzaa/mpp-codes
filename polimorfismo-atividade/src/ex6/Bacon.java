package ex6;

public class Bacon implements Pizza{
    @Override
    public void preparar() {
        System.out.println("molho, queijo, bacon, brocolis");
    }

    @Override
    public void assar() {
        System.out.println("20 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$ 20.00");
    }

    public void bordaEspecial() {

    }
}
