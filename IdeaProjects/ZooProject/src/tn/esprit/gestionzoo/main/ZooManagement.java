package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.*;

public class ZooManagement {
    public static void main(String[] args) {
        try {
            // Tests Prosit 8
            System.out.println("=== PROSIT 8 TESTS ===");

            // Création des objets
            Dolphin dolphin = new Dolphin("Cétacés", "Flipper", 7, true, "Océan", 45.5f);
            Penguin penguin = new Penguin("Oiseaux", "Pingou", 2, true, "Antarctique", 30.0f);
            Terrestrial bear = new Terrestrial("Ursidé", "Ours", 8, true, 4);

            // Tests des méthodes Carnivore/Omnivore
            System.out.println("\n--- Tests Dolphin (Carnivore) ---");
            dolphin.eatMeat(Food.MEAT);
            dolphin.eatMeat(Food.PLANT);

            System.out.println("\n--- Tests Penguin (Carnivore) ---");
            penguin.eatMeat(Food.MEAT);
            penguin.eatMeat(Food.BOTH);

            System.out.println("\n--- Tests Bear (Omnivore) ---");
            bear.eatMeat(Food.MEAT);
            bear.eatPlant(Food.PLANT);
            bear.eatPlantAndMeat(Food.BOTH);
            bear.eatPlantAndMeat(Food.MEAT);

        } catch (InvalidAgeException e) {
            System.out.println("Erreur d'âge: " + e.getMessage());
        }
    }
}