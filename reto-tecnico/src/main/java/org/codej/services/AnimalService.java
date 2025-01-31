package org.codej.services;

import org.codej.enums.AnimalType;
import org.codej.models.*;
import org.springframework.stereotype.Service;


@Service
public class AnimalService {
    public Animal crearAnimal(String name, AnimalType type, String sonido) {
        switch (type) {
            case TERRESTRE:
                return new TerrestreAnimal(name, sonido);
            case ACUATICO:
                return new AcuaticoAnimal(name, sonido);
            case VOLADOR:
                return new VoladorAnimal(name, sonido);
            default:
                throw new IllegalArgumentException("Tipo de animal no reconocido");
        }
    }
}