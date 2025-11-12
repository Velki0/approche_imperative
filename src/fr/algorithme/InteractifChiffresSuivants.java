package fr.algorithme;

import java.util.Scanner;

public class InteractifChiffresSuivants {

    // Demander à l'utilisateur un nombre puis afficher les 10 nombres suivant.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre");
        int choixUtilisateur = scanner.nextInt();
        for (int index = 1; index < 10; index++) {
            System.out.print(choixUtilisateur + index + ", ");
        }
        System.out.print(choixUtilisateur + 10 + ".");
        scanner.close();
    }
}
