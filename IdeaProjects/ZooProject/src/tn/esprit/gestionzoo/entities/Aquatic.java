package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public abstract class Aquatic extends Animal implements Carnivore<Food> {
    private String habitat;

    public Aquatic() { super(); }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    // Implémentation de l'interface Carnivore
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(this.getName() + " is eating meat.");
        } else {
            System.out.println(this.getName() + " doesn't eat this type of food.");
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Méthode abstraite
    public abstract void swim();

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }
}