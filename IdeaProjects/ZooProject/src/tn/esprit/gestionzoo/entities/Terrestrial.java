package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class Terrestrial extends Animal implements Omnivore<Food> {
    private int nbrLegs;

    public Terrestrial() { super(); }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    // Implémentation des interfaces
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(this.name + " is eating meat.");
        } else {
            System.out.println(this.name + " doesn't eat meat.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(this.name + " is eating plants.");
        } else {
            System.out.println(this.name + " doesn't eat plants.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(this.name + " is eating both plants and meat.");
        } else {
            System.out.println(this.name + " prefers mixed diet.");
        }
    }

    public int getNbrLegs() { return nbrLegs; }
    public void setNbrLegs(int nbrLegs) { this.nbrLegs = nbrLegs; }

    @Override
    public String toString() {
        return super.toString() + ", Nombre de pattes: " + nbrLegs;
    }
}