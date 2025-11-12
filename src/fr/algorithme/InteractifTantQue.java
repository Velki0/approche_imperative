package fr.algorithme;

import java.util.Scanner;

public class InteractifTantQue {

    // Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement compris entre 1 et 10
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre compris entre 1 et 10");
        int choixUtilisateur = scanner.nextInt();
        while (choixUtilisateur > 10 || choixUtilisateur < 1) {
            System.out.println("Veuillez entrer un nombre correct ! Entre 1 et 10 !!!");
            choixUtilisateur = scanner.nextInt();
        }
        System.out.println("Le numéro que vous avez choisi est le : " + choixUtilisateur + ".");
        scanner.close();
    }
}
