package fr.algorithme;

public class SommeDeTableaux {

    public static void main(String[] args) {

        int[] tableau1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] tableau2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;

        // Créer un tableau qui contient la somme des 2 précédents tableaux
        int[] nouveauTableau = new int[tableau1.length];
        for (int index = 0; index < tableau1.length; index++) {
            nouveauTableau[index] = tableau1[index] + tableau2[index];
            System.out.print(nouveauTableau[index] + " ");
        }
    }
}
