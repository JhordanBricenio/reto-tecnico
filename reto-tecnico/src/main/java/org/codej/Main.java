package org.codej;

import org.codej.config.AppConfig;
import org.codej.enums.AnimalType;
import org.codej.models.Animal;
import org.codej.services.AnimalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalService animalService = context.getBean(AnimalService.class);
        main.validArguments(args);
        List<Animal> animals = new ArrayList<>();
        main.processArguments(args, animalService, animals);
        main.groupAnimalsForType(animals);
    }

    private void validArguments(String[] args) {
        if (args.length == 0) {
            System.out.println("Formato de entrada esperado: nombre|tipo|onomatopeya");
            System.out.println("Ejemplo: java -jar retoTecnico-1.0-SNAPSHOT.jar \"Perro|TERRESTRE|guauguau\" \"Pez|ACUATICO|gluglu\"");
        }
    }
    private void processArguments(String[] args, AnimalService animalService,
                                    List<Animal> animals) {
        for (String arg : args) {
            String[] data = arg.split("\\|");
            if (data.length != 3) {
                System.out.println("Formato inválido: " + arg);
                continue;
            }
            if (data[0].isEmpty() || data[1].isEmpty() || data[2].isEmpty()) {
                System.out.println("Formato inválido: " + arg);
                continue;
            }

            try {
                String name = data[0];
                AnimalType type = AnimalType.valueOf(data[1].toUpperCase());
                String sound = data[2];

                Animal animal = animalService.crearAnimal(name, type, sound);
                animals.add(animal);
            } catch (IllegalArgumentException e) {
                System.out.println("Error procesando: " + arg);
            }
        }
    }
    private void groupAnimalsForType(List<Animal> animals) {
        Map<AnimalType, List<Animal>> groupForType = animals.stream()
                .collect(Collectors.groupingBy(Animal::getType));
        groupForType.forEach((type, list) -> {
            System.out.println("\nAnimales de tipo: " + type);
            list.forEach(animal -> System.out.println(animal.description()));
        });
    }

}