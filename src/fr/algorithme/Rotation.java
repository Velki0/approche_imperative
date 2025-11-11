package fr.algorithme;

public class Rotation {

    public static void main(String[] args) {

        int[] tableau = {6, 3, 2, 5, 8} ;

        // Faire la rotation à droite du tableau
        int numPrecedent = tableau[0];
        int numActuel;
        for (int index = 1; index < tableau.length; index++) {
            numActuel = tableau[index];
            tableau[index] = numPrecedent;
            numPrecedent = numActuel;
        }
        tableau[0] = numPrecedent;
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }
    }
}
