package fr.algorithme;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    // Demander à l'utilisateur un nombre puis afficher les 10 nombres suivant.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre");
        int choixUtilisateur = sc.nextInt();
        for (int index = 1; index < 10; index++) {
            System.out.print(choixUtilisateur + 1 + ", ");
        }
        System.out.print(choixUtilisateur + 10 + ".");
        sc.close();
    }
}
