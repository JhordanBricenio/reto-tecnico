package org.codej.services;

import org.codej.enums.AnimalType;
import org.codej.models.*;
import org.springframework.stereotype.Service;


@Service
public class AnimalService {
    public Animal createAnimal(String name, AnimalType type, String sound) {
        switch (type) {
            case TERRESTRE:
                return new TerrestreAnimal(name, sound);
            case ACUATICO:
                return new AcuaticoAnimal(name, sound);
            case VOLADOR:
                return new VoladorAnimal(name, sound);
            default:
                throw new IllegalArgumentException("Tipo de animal no reconocido");
        }
    }
}