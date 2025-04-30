package Proxy;

import Classes.SecureDoor;
import Interfaces.DoomDoor;

public class KeycardProxy implements DoomDoor {
    private SecureDoor secureDoor;
    private String doorColor;
    private String keycard;

    public KeycardProxy(String doorColor, String keycard) {
        this.doorColor = doorColor;
        this.keycard = keycard;
    }

    @Override
    public void open() {
        if (!hasValidKeycard()) {
            System.out.println("Chave inválida! A porta " + doorColor + " permanece trancada.");
            return;
        }
        if (secureDoor == null) {
            secureDoor = new SecureDoor(doorColor); // Lazy loading
        }
        secureDoor.open();
    }

    private boolean hasValidKeycard() {
        return keycard != null && keycard.equalsIgnoreCase(doorColor);
    }
}
