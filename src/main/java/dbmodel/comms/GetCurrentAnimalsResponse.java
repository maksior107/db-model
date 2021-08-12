package dbmodel.comms;

import dbmodel.models.Animal;

import java.util.List;

public class GetCurrentAnimalsResponse {
    private List<Animal> animals;

    List<Animal> getAnimals() {
        return animals;
    }

    void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
