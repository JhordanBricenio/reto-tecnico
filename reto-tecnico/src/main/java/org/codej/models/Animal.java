package org.codej.models;

import org.codej.enums.AnimalType;

public abstract class Animal {
    protected String name;
    protected AnimalType type;
    protected String sound;

    public Animal(String name, AnimalType type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public AnimalType getType() {
        return type;
    }

    public String description() {
        return name + " hace " + sound;
    }
}