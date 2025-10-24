package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Safari Park", "Tunis");

        // Animaux terrestres
        Animal lion = new Animal("Félidé", "Lion", 5, true);
        Animal tiger = new Animal("Félidé", "Tigre", 3, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);

        // INSTRUCTION 26 : Animaux aquatiques
        Dolphin dolphin1 = new Dolphin("Cétacés", "Flipper", 7, true, "Océan", 45.5f);
        Dolphin dolphin2 = new Dolphin("Cétacés", "Dolly", 5, true, "Océan", 40.0f);
        Penguin penguin1 = new Penguin("Oiseaux", "Pingou", 2, true, "Antarctique", 30.0f);
        Penguin penguin2 = new Penguin("Oiseaux", "Pingou", 2, true, "Antarctique", 30.0f); // Test equals
        Penguin penguin3 = new Penguin("Oiseaux", "Glacius", 4, true, "Arctique", 50.0f);

        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(dolphin2);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(penguin2);
        myZoo.addAquaticAnimal(penguin3);

        // INSTRUCTION 27 : Faire nager tous les aquatiques
        myZoo.makeAllAquaticsSwim();

        // INSTRUCTION 29 : Profondeur maximale
        System.out.println("\nProfondeur maximale des pingouins : " + myZoo.maxPenguinSwimmingDepth() + " mètres");

        // INSTRUCTION 30 : Statistiques par type
        myZoo.displayNumberOfAquaticsByType();

        // INSTRUCTION 31 : Test de la méthode equals
        System.out.println("\n=== Test de la méthode equals() ===");
        System.out.println("penguin1 equals penguin2 : " + penguin1.equals(penguin2)); // true
        System.out.println("penguin1 equals penguin3 : " + penguin1.equals(penguin3)); // false

        myZoo.displayAnimals();
    }
}