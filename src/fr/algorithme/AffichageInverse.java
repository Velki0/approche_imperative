package fr.algorithme;

public class AffichageInverse {

    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        // Afficher l’ensemble des éléments du tableau grâce à une boucle
        for (int valeur : array) {
            System.out.print(valeur + " ");
        }
        // Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        for (int index1 = array.length-1; index1 >= 0; index1--) {
            System.out.print(array[index1] + " ");
        }
        // Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
        int[] arrayCopy = new int[array.length];
        for (int index2 = 0; index2 < array.length; index2++) {
            arrayCopy[index2] = array[index2];
            System.out.print(arrayCopy[index2] + " ");
        }
    }
}
