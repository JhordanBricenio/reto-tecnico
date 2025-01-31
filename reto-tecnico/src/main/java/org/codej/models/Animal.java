package org.codej.models;

import org.codej.enums.AnimalType;

public abstract class Animal {
    protected String name;
    protected AnimalType type;
    protected String sonido;

    public Animal(String name, AnimalType type, String sonido) {
        this.name = name;
        this.type = type;
        this.sonido = sonido;
    }

    public String getName() {
        return name;
    }

    public AnimalType getType() {
        return type;
    }

    public String description() {
        return name + " hace " + sonido;
    }
}