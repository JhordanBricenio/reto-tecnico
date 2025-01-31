package org.codej.models;

import org.codej.enums.AnimalType;

public class AcuaticoAnimal extends Animal {


    public AcuaticoAnimal(String name, String sound) {
        super(name, AnimalType.ACUATICO, sound);
    }

    @Override
    public String description() {
        return this.getName() + " hace " + this.getSound();
    }

}
