package fr.algorithme;

import java.util.Scanner;

public class InteractifPlusMoins {
    // Ecrire un jeu de "plus ou moins".
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nombreAleatoire = Math.floor(Math.random() * 100) + 1;
        System.out.println("Veuillez entrer un nombre pour commencer à deviner");
        int choixUtilisateur = sc.nextInt();
        int nbEssais = 1;
        while (choixUtilisateur != nombreAleatoire) {
            if (choixUtilisateur > nombreAleatoire) {
                System.out.print("C'est moins ! ");
            } else {
                System.out.print("C'est plus ! ");
            }
            System.out.println("Essayez encore !");
            choixUtilisateur = sc.nextInt();
            nbEssais++;
        }
        System.out.print("Bravo, vous avez trouvé en " + nbEssais + " coups");
    }
}
