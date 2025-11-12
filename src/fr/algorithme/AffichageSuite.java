package fr.algorithme;

public class AffichageSuite {

    public static void main(String[] args) {

        // Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
        for (int index1 = 0; index1 <= 10; index1++) {
            System.out.println(index1);
        }
        // Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
        for (int index2 = 0; index2 <= 10; index2++) {
            if (index2 % 2 == 1) {
                System.out.println(index2);
            }
        }
        // Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
        int index3 = 1;
        while (index3 <= 10) {
            System.out.println(index3);
            index3++;
        }
        // Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
        int index4 = 0;
        while (index4 <= 10) {
            if (index4 % 2 == 0) {
                System.out.println(index4);
            }
            index4++;
        }
        // Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus
        int index5 = 0;
        while (index5 <= 10) {
            if (index5 % 2 == 1) {
                System.out.println(index5);
            }
            index5++;
        }
    }
}
