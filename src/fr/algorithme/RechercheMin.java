package fr.algorithme;

public class RechercheMin {

    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        // Rechercher le plus petit élément du tableau
        int valeurMin = array[0];
        for (int valeur : array) {
            if  (valeur < valeurMin) {
                valeurMin = valeur;
            }
        }
        System.out.println(valeurMin);
    }
}
