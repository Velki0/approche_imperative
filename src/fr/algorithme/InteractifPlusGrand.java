package fr.algorithme;

import java.util.Scanner;

public class InteractifPlusGrand {
    // Demander à l'utilisateur dix nombre puis afficher le plus grand.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabChoixUtilisateur = new int[10];
        for (int index = 0; index < 10; index++) {
            System.out.println("Veuillez votre nombre numéro : " + (index + 1));
            tabChoixUtilisateur[index] = sc.nextInt();
        }
        int valeurMax = tabChoixUtilisateur[0];
        for (int valeur : tabChoixUtilisateur) {
            if  (valeur > valeurMax) {
                valeurMax = valeur;
            }
        }
        System.out.println("La valeur maximale est : " + valeurMax);
    }
}
