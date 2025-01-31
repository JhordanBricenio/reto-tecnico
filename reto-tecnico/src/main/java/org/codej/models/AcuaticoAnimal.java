package org.codej.models;

import org.codej.enums.AnimalType;

public class AcuaticoAnimal extends Animal{
    public AcuaticoAnimal(String name, String sonido) {
        super(name, AnimalType.ACUATICO, sonido);
    }
}
