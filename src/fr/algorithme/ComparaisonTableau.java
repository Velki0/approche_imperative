package fr.algorithme;

public class ComparaisonTableau {

    public static void main(String[] args) {

        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
        // Ecrire le code permettant de compter le nombre d’éléments en commun dans ces 2 tableaux
        int nombreEgalite = 0;
        for (int valeur1 : array1) {
            for (int valeur2 : array2){
                if (valeur1 == valeur2) {
                    nombreEgalite++;
                }
            }
        }
        System.out.println(nombreEgalite);
    }
}
