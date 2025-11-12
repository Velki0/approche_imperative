package fr.algorithme;

import java.util.Scanner;

public class InteractifFibonacci {

    // Ecrire une méthode qui demande à l'utilisateur un rang et renvoie la valeur de ce rang de la suite de Fibbonacci.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le rang N voulu de la suite de Fibonacci.");
        int choixUtilisateur = scanner.nextInt();
        long[] tableauSuiteFibonacci = new long[choixUtilisateur + 1];
        tableauSuiteFibonacci[0] = 0;
        tableauSuiteFibonacci[1] = 1;
        for (int index = 2; index <= choixUtilisateur; index++) {
            tableauSuiteFibonacci[index] = tableauSuiteFibonacci[index - 1] + tableauSuiteFibonacci[index - 2];
        }
        System.out.print("La valeur du rang " + choixUtilisateur + " de la suite de Fibonacci est : " + tableauSuiteFibonacci[choixUtilisateur]);
    }
}
