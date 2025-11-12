package fr.algorithme;

import java.util.Scanner;

public class Interfactif21Batons {

    // Création jeu des 21 bâtons contre l'ordinateur : Il ne faut pas retirer le dernier et on peut choisir d'en retirer entre 1 à 3 à chaque tour.
    public static void main(String[] args) {

        int batonsRestants = 21;
        int joueurActif = entierAleatoire(1,2);
        int batonsARetirer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu des 21 bâtons.");
        while (batonsRestants != 0) {
            System.out.println("Il reste actuellement " +  batonsRestants + " bâtons.");
            if (joueurActif == 1) {
                batonsARetirer = choixNombreBatonsOrdinateur(batonsRestants);
                batonsRestants -= batonsARetirer;
                System.out.println("C'est au tour de l'ordinateur.\n" +
                        "Il choisit de retirer " + batonsARetirer + " bâtons.");
                joueurActif = 2;
            } else {
                    System.out.println("C'est à votre tour. Veuillez choisir un nombre de bâtons à retirer entre 1 et 3.");
                    batonsARetirer = scanner.nextInt();
                    while ((batonsARetirer != 1 && batonsARetirer != 2 && batonsARetirer != 3)
                            || (batonsRestants - batonsARetirer < 0)) {
                        System.out.println("Votre nombre de bâtons choisis est incorrect !\n" +
                                "Veuillez choisir un nombre de bâtons à retirer entre 1 et 3 et inférieur ou égal au nombre de bâtons restants.");
                        batonsARetirer = scanner.nextInt();
                    }
                    batonsRestants -= batonsARetirer;
                    joueurActif = 1;
            }
        }
        if (joueurActif == 2) {
            System.out.println("Félicitations ! Vous avez gagné ! Vous avez triomphé de l'ordinateur !");
        } else {
            System.out.println("Dommage ! Vous avez perdu ! L'ordinateur était trop fort ...");
        }
    }

    private static int entierAleatoire(int nombreMinimal, int nombreMaximal) {
        // Methode pour obtenir un entier aléatoire entre nombreMinimal et nombreMaximal
        return (int) (Math.floor(Math.random() * nombreMaximal) + nombreMinimal);
    }

    private static int choixNombreBatonsOrdinateur(int nombreDeBatonsRestants) {
        // Méthode pour le choix de l'ordinateur de son nombre de bâtons
        // Choix simple et sans reflexion de la part de l'ordinateur :  return entierAleatoire(1,nombreDeBatonsRestants);
        // Essayons de le rendre légèrement plus difficile à battre :
        return switch (nombreDeBatonsRestants) {
            case 1, 2, 6, 10 -> 1;
            case 3, 7, 11 -> 2;
            case 4, 8, 12 -> 3;
            default -> entierAleatoire(1, 3);
        };
    }
}
