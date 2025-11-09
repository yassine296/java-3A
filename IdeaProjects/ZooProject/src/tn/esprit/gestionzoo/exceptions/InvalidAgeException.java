package tn.esprit.gestionzoo.exceptions;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("L'âge d'un animal ne peut pas être négatif !");
    }
}