package fr.algorithme;

import java.util.Scanner;

public class InteractifTableMult {
    // Demander à l'utilisateur un nombre puis générer la table de multiplication de ce nombre.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre compris entre 1 et 10");
        int choixUtilisateur = sc.nextInt();
        while (choixUtilisateur > 10 || choixUtilisateur < 1) {
            System.out.println("Veuillez entrer un nombre correct ! Entre 1 et 10 !!!");
            choixUtilisateur = sc.nextInt();
        }
        for (int index = 1; index < 11; index++) {
            System.out.println(choixUtilisateur + " x " + index + " = " + choixUtilisateur * index);
        }
        sc.close();
    }
}
