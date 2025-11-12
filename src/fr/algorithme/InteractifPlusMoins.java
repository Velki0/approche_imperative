package fr.algorithme;

import java.util.Scanner;

public class InteractifPlusMoins {

    // Ecrire un jeu de "plus ou moins".
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nombreAleatoire = (int) Math.floor(Math.random() * 100) + 1;
        System.out.println("Veuillez entrer un nombre pour commencer à deviner.");
        int choixUtilisateur = scanner.nextInt();
        int nbEssais = 1;
        while (choixUtilisateur != nombreAleatoire) {
            if (choixUtilisateur > nombreAleatoire) {
                System.out.print("C'est moins ! ");
            } else {
                System.out.print("C'est plus ! ");
            }
            System.out.println("Essayez encore !");
            choixUtilisateur = scanner.nextInt();
            nbEssais++;
        }
        System.out.print("Bravo, vous avez trouvé en " + nbEssais + " coups");
        scanner.close();
    }
}
