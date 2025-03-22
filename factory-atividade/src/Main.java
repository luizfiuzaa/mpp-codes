import Classes.Factories.CharacterFactory;
import Classes.Factories.KingFactory;

public class Main {
    public static void main(String[] args) {
        CharacterFactory king = new KingFactory();
        king.attack();
    }
}