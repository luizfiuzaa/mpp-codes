package Classes.Factories;

import Classes.Characters.King;
import Interfaces.Character;

public class KingFactory extends CharacterFactory{
    public KingFactory(){
        super("King");
    }

    @Override
    public Character select() {
        System.out.println("Selected '"+name+"'");
        System.out.println(name + " Does Grab attack");
        return new King(name);
    }
}
