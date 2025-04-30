package Classes;

import Interfaces.DoomDoor;

public class SecureDoor implements DoomDoor {
    private String doorColor;

    public SecureDoor(String doorColor){
        this.doorColor = doorColor;
    }

    private void initializeDoor(){
        System.out.println("Inicializando porta " + doorColor + "!");
    }

    @Override
    public void open() {
        System.out.println("Porta " + doorColor + " aberta!");
    }
}