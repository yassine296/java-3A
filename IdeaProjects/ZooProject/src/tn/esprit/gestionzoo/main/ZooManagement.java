package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Safari Park", "Tunis");

        try {
            // Test ZooFullException
            Animal lion = new Animal("Félidé", "Lion", 5, true);
            Animal tiger = new Animal("Félidé", "Tigre", 3, true);
            Animal bear = new Animal("Ursidé", "Ours", 8, true);
            Animal wolf = new Animal("Canidé", "Loup", 4, true); // Va échouer

            myZoo.addAnimal(lion);
            myZoo.addAnimal(tiger);
            myZoo.addAnimal(bear);
            myZoo.addAnimal(wolf); // Lève ZooFullException

        } catch (ZooFullException e) {
            System.out.println("ERREUR: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("ERREUR ÂGE: " + e.getMessage());
        } finally {
            System.out.println("Nombre d'animaux: " + myZoo.getAnimalCount());
        }

        // Test InvalidAgeException
        try {
            Animal invalid = new Animal("Test", "Invalid", -5, true);
        } catch (InvalidAgeException e) {
            System.out.println("ERREUR: " + e.getMessage());
        }
    }
}