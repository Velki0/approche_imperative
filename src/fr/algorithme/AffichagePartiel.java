package fr.algorithme;

public class AffichagePartiel {

    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        // Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
        for (int valeur1 : array) {
            if (valeur1 > 3) {
                System.out.print(valeur1 + " ");
            }
        }

        // Combiner une boucle et un test de manière à n’afficher que les entiers pairs
        for (int valeur2 : array) {
            if (valeur2 % 2 == 0) {
                System.out.print(valeur2 + " ");
            }
        }

        // Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant aux index pairs
        for (int index = 0; index < array.length; index++) {
            if (index % 2 == 0) {
                System.out.print(array[index] + " ");
            }
        }

        // Combiner une boucle et un test de manière à n’afficher que les entiers impairs
        for (int valeur3 : array) {
            if (valeur3 % 2 == 1) {
                System.out.print(valeur3 + " ");
            }
        }
    }
}
