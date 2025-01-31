package org.codej.models;

import org.codej.enums.AnimalType;

public class TerrestreAnimal extends Animal {

    public TerrestreAnimal(String name, String sonido) {
        super(name, AnimalType.TERRESTRE, sonido);
    }

}
