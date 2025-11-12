package fr.algorithme;

public class InversionContenu {

    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        // Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.
        int[] arrayCopy = new int[array.length];
        int index = array.length - 1;
        for (int valeur : array) {
            arrayCopy[index] = valeur;
            index--;
        }
        // Afficher l’ensemble des éléments des 2 tableaux
        for  (int valeur1 : array) {
            System.out.print(valeur1 + " ");
        }
        for  (int valeur2 : arrayCopy) {
            System.out.print(valeur2 + " ");
        }
    }
}
