import Classes.SecureDoor;
import Interfaces.DoomDoor;
import Proxy.KeycardProxy;

public class Main {
    public static void main(String[] args) {
        // Doom Slayer com a chave correta
        DoomDoor door = new KeycardProxy("Vermelha", "Vermelha");
        door.open();

        // Demônio com chave errada
        DoomDoor demonAttempt = new KeycardProxy("Vermelha", "Azul");
        demonAttempt.open();
    }
}