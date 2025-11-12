package fr.algorithme;

public class RechercheMax {

    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        // Rechercher le plus grand élément du tableau
        int valeurMax = array[0];
        for (int valeur : array) {
            if  (valeur > valeurMax) {
                valeurMax = valeur;
            }
        }
        System.out.println(valeurMax);
    }
}
