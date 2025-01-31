package org.codej.models;

import org.codej.enums.AnimalType;

public class TerrestreAnimal extends Animal {

    public TerrestreAnimal(String name, String sound) {
        super(name, AnimalType.TERRESTRE, sound);
    }

    @Override
    public String description() {
        return this.getName() + " hace " + this.getSound();
    }


}
