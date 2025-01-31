package org.codej.models;

import org.codej.enums.AnimalType;

public class VoladorAnimal extends Animal {

    public VoladorAnimal(String name, String sound) {
        super(name, AnimalType.VOLADOR, sound);
    }

}
