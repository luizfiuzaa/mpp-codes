import AbstractFactories.PersonagemFactory;
import ConcreteFactories.UrukHaiFactory;
import ConcreteFactories.LegolasFactory;
import Interfaces.Personagem;

public class Main {
    public static void main(String[] args) {
        PersonagemFactory urukFactory = new UrukHaiFactory();
        PersonagemFactory legolasFactory = new LegolasFactory();

        Personagem uruk = urukFactory.createCharacter();
        Personagem legolas = legolasFactory.createCharacter();

        uruk.attack();
        legolas.attack();
    }
}