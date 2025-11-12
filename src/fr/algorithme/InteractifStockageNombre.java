package fr.algorithme;

import java.util.Scanner;

public class InteractifStockageNombre {

    // Ecrire un programme interactif pour ajouter des nombres dans un tabeau et / ou l'afficher
    public static void main(String[] args) {

        int[] tableauEntiers = {20, -52, 2025, 0, 9};
        int choixUtilisateur;
        do {
            choixUtilisateur = recupererChoix();
            switch (choixUtilisateur) {
                case 1:
                    int choixElementAAjouter = recupererChoixElement();
                    tableauEntiers = ajouterElementTableau(tableauEntiers, choixElementAAjouter);
                    continue;
                case 2:
                    afficherTableau(tableauEntiers);
                    continue;
                case 3:
                    break;
            }
        } while (choixUtilisateur != 3);
    }

    private static int recupererChoix() {
        // Méthode pour demander le choix de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Veuillez taper 1, 2 ou 3 pour :
                1. Ajouter un nombre
                2. Afficher les nombres existants
                3. Quitter la méthode""");
        return scanner.nextInt();
    }

    private static int recupererChoixElement() {
        // Méthode pour demander le choix de l'utilisateur pour l'élément à ajouter
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un numéro à ajouter au tableau.");
        return scanner.nextInt();
    }

    private static void afficherTableau(int[] tableauAAfficher) {
        // Méthode pour afficher le tableau
        System.out.print("Voici le tableau actuellement : [");
        for (int index = 0; index < tableauAAfficher.length - 1; index++) {
            System.out.print(tableauAAfficher[index] + ", ");
        }
        System.out.println(tableauAAfficher[tableauAAfficher.length - 1] + "]");
    }

    private static int[] ajouterElementTableau(int[] tableau, int element) {
        // Méthode pour modifier le tableau et pouvoir y ajouter un élément
        // NB : L'utilisation des ArrayList seraient plus efficaces, mais il a été réalisé comme ci-dessous dans l'esprit de l'exercice
        int[] nouveauTableau = new int[tableau.length + 1];
        System.arraycopy(tableau, 0, nouveauTableau, 0, tableau.length);
        nouveauTableau[tableau.length] = element;
        return nouveauTableau;
    }
}
