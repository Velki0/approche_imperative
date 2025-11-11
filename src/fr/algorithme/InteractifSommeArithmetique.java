package fr.algorithme;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    // Demander à l'utilisateur un nombre puis afficher la somme de 1 jusqu'à ce nombre.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre");
        int choixUtilisateur = sc.nextInt();
        int sommeNb = choixUtilisateur;
        for (int index = 1; index < choixUtilisateur; index++) {
            sommeNb += index;
        }
        System.out.print("La somme des entiers de 1 jusqu'à " + choixUtilisateur + " est de : " + sommeNb);
        sc.close();
    }
}
