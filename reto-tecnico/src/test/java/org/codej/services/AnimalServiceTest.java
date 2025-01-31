package org.codej.services;

import org.codej.enums.AnimalType;
import org.codej.models.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalServiceTest {
    private final AnimalService animalService = new AnimalService();

    @Test
    public void testCreateAnimalTerrestre() {
        Animal animal = animalService.createAnimal("Perro", AnimalType.TERRESTRE, "guauguau");
        assertNotNull(animal);
        assertEquals("Perro", animal.getName());
        assertEquals(AnimalType.TERRESTRE, animal.getType());
        assertEquals("Perro hace guauguau", animal.description());
    }

    @Test
    public void testCreateAnimalAcuatico() {
        Animal animal = animalService.createAnimal("Pez", AnimalType.ACUATICO, "gluglu");
        assertNotNull(animal);
        assertEquals("Pez", animal.getName());
        assertEquals(AnimalType.ACUATICO, animal.getType());
        assertEquals("Pez hace gluglu", animal.description());
    }

    @Test
    public void testCreateAnimalVolador() {
        Animal animal = animalService.createAnimal("Loro", AnimalType.VOLADOR, "crocoroco");
        assertNotNull(animal);
        assertEquals("Loro", animal.getName());
        assertEquals(AnimalType.VOLADOR, animal.getType());
        assertEquals("Loro hace crocoroco", animal.description());
    }

    @Test
    public void testCreateAnimalTipoDesconocido() {
        assertThrows(IllegalArgumentException.class, () -> {
            animalService.createAnimal("Dragon", AnimalType.valueOf("FANTASTICO"), "rugido");
        });
    }

}
