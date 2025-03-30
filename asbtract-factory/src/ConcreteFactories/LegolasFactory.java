package ConcreteFactories;

import AbstractFactories.PersonagemFactory;
import Classes.Legolas;
import Interfaces.Personagem;

public class LegolasFactory extends PersonagemFactory {
    public Personagem createCharacter() {
        return new Legolas();
    }
}