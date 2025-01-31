# 🦁 Reto Técnico - Agrupación de Animales en Java

Este proyecto implementa la creación de objetos de animales con la funcionalidad de **onomatopeyas**. Los animales se agrupan por tipo y se imprimen en pantalla de manera estructurada.

## 🚀 Tecnologías utilizadas

- Java 17 (Compatible con Java 8 y 11)
- Maven como gestor de dependencias
- Spring Core (sin Spring Boot)
- JUnit para pruebas unitarias
- Uso de:
  - Enums
  - Interfaces
  - Clases abstractas y concretas
  - API Streams

## 📤 Ejecución del proyecto

   ## Compilación de programa
   mvn clean package
   ## Ejecución del programa
   java -jar target/reto-tecnico-1.0-SNAPSHOT.jar "Perro|terrestre|guauguau" "Mariposa|VOLADOR|grugru"


## 📒 Ejemplo de salida
  🐾 Animales de tipo: VOLADOR
   - Mariposa hace grugru

🦅 Animales de tipo: TERRESTRE
   - Perro hace guauguau

## 👨🏾‍🏫 Ejecución de pruebas unitarias

  mvn test

## 📒 Estructura del proyecto
src/
 ├── main/
 │   ├── java/org/codej/
 │   │   ├── config/
 │   │   │   ├── AppConfig.java
 │   │   ├── enums/
 │   │   │   ├── AnimalType.java
 │   │   ├── interfaces/
 │   │   │   ├── AnimalDescription.java
 │   │   ├── models/
 │   │   │   ├── Animal.java
 │   │   │   ├── TerrestreAnimal.java
 │   │   │   ├── VoladorAnimal.java
 │   │   │   ├── AcuaticoAnimal.java
 │   │   ├── services/
 │   │   │   ├── AnimalService.java
 │   │   ├── Main.java
 │   ├── resources/
 │
 ├── test/
 │   ├── java/com/codej/model/
 │   │   ├── AnimalTest.java
 │
 ├── pom.xml


 ## 🏢 Repositorio y pull request
 
 master
 ├── develop
       ├── feature/retoTecnico
            ├── Creacion del proyecto
            ├── Implementacion del reto
            ├── Trabajando con spring framework
            ├── Refactorizando método main y ejecución de pruebas
            ├── Actualizando interface y refactor clases que implemantan
            ├── Implementacion de los test

   







