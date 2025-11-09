package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class Zoo {
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private String name;
    private String city;
    private final int NBR_CAGES = 3; // Réduit à 3 comme demandé

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.aquaticAnimals = new Aquatic[10];
    }

    // MODIFIÉ : retour void + exception
    public void addAnimal(Animal animal) throws ZooFullException {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                System.out.println("Animal ajouté : " + animal.getName());
                return;
            }
        }
        throw new ZooFullException();
    }

    public void addAquaticAnimal(Aquatic aquatic) throws ZooFullException {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                System.out.println("Animal aquatique ajouté : " + aquatic.getName());
                return;
            }
        }
        throw new ZooFullException();
    }

    public int getAnimalCount() {
        int count = 0;
        for (Animal animal : animals) {
            if (animal != null) count++;
        }
        return count;
    }

    // Tes autres méthodes existantes...
}