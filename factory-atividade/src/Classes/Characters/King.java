package Classes.Characters;

import Interfaces.Character;

public class King implements Character {
    private String name;

    public King(String name){
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println(name + " hit Eddy");
    }
}
