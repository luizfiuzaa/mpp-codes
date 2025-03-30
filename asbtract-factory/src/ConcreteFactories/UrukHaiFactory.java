package ConcreteFactories;

import AbstractFactories.PersonagemFactory;
import Classes.UrukHai;
import Interfaces.Personagem;

public class UrukHaiFactory extends PersonagemFactory {
    public Personagem createCharacter() {
        return new UrukHai();
    }
}