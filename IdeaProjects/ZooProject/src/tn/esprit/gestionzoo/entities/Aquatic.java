package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal { // INSTRUCTION 28 : classe abstraite
    private String habitat;

    public Aquatic() {
        super();
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // INSTRUCTION 28 : méthode abstraite
    public abstract void swim();

    // INSTRUCTION 31 : méthode equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Aquatic aquatic = (Aquatic) obj;
        return this.getName().equals(aquatic.getName()) &&
                this.getAge() == aquatic.getAge() &&
                this.habitat.equals(aquatic.habitat);
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitat=" + habitat;
    }
}