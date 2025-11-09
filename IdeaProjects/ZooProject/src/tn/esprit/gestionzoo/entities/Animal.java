package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal() {}

    public Animal(String family, String name, int age, boolean isMammal) throws InvalidAgeException {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    // Getters et setters...
    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) throw new InvalidAgeException();
        this.age = age;
    }

    // Autres méthodes...
}