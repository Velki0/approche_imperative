package fr.algorithme;

public class SommeDeTableauxDiff {

    public static void main(String[] args) {

        int[] tableau1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tableau2 = {-1, 12, 17, 14, 5, -9, 0, 18 };
        // Créer un tableau qui contient la somme des 2 précédents tableaux
        int [] nouveauTableau = new int[tableau1.length];
        for (int index = 0; index < nouveauTableau.length; index++) {
            if ( index < tableau2.length ) {
                nouveauTableau[index] = tableau1[index] + tableau2[index];
            } else {
                nouveauTableau[index] = tableau1[index];
            }
            System.out.print(nouveauTableau[index] + " ");
        }
    }
}
