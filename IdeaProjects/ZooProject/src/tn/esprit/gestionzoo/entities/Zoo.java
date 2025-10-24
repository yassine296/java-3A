package tn.esprit.gestionzoo.entities;

public class Zoo {
    private String name;
    private String city;
    private Animal[] animals;
    private Aquatic[] aquaticAnimals; // INSTRUCTION 25
    private int animalCount;
    private int aquaticCount;
    private int capacity = 25;
    private final int AQUATIC_CAPACITY = 10;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[capacity];
        this.aquaticAnimals = new Aquatic[AQUATIC_CAPACITY]; // INSTRUCTION 25
        this.animalCount = 0;
        this.aquaticCount = 0;
    }

    // Méthodes existantes...
    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Erreur : le nom du zoo ne doit pas être vide !");
        } else {
            this.name = name;
        }
    }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public boolean isZooFull() { return animalCount >= capacity; }

    public void addAnimal(Animal animal) {
        if (animal == null) {
            System.out.println("Erreur : l'animal ne peut pas être nul !");
            return;
        }
        if (isZooFull()) {
            System.out.println("Le zoo est plein, impossible d'ajouter " + animal.getName());
            return;
        }
        animals[animalCount++] = animal;
        System.out.println(animal.getName() + " a été ajouté au zoo " + name);
    }

    // INSTRUCTION 26 : Ajouter un animal aquatique
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquatic == null) {
            System.out.println("Erreur : l'animal aquatique ne peut pas être nul !");
            return;
        }
        if (aquaticCount >= AQUATIC_CAPACITY) {
            System.out.println("Le zoo aquatique est plein, impossible d'ajouter " + aquatic.getName());
            return;
        }
        aquaticAnimals[aquaticCount++] = aquatic;
        System.out.println(aquatic.getName() + " a été ajouté à la section aquatique du zoo " + name);
    }

    // INSTRUCTION 27 : Afficher swim() de tous les animaux aquatiques
    public void makeAllAquaticsSwim() {
        System.out.println("\n=== Tous les animaux aquatiques nagent ===");
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    // INSTRUCTION 29 : Profondeur maximale des pingouins
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    // INSTRUCTION 30 : Afficher le nombre par type
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("\n=== Statistiques aquatiques ===");
        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
        System.out.println("Total animaux aquatiques : " + aquaticCount);
    }

    public void displayAnimals() {
        System.out.println("\nAnimaux du zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Nombre d'animaux=" + animalCount + ", Animaux aquatiques=" + aquaticCount + "]";
    }
}