package fr.algorithme;

public class CalculMoyenne {

    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        // Quelle est la moyenne des éléments du tableau ?
        int moyenne = 0;
        for (int valeur : array) {
            moyenne += valeur;
        }
        moyenne = moyenne / array.length;
        System.out.println(moyenne);
    }
}
