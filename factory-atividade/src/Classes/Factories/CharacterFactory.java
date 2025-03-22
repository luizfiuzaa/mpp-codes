package Classes.Factories;

import Interfaces.Character;

public abstract class CharacterFactory {
    protected String name;

    public CharacterFactory(String name){
        this.name = name;
    };

    public abstract Interfaces.Character select();

    public void attack(){
        Interfaces.Character character = select();
        character.attack();
    }
}
