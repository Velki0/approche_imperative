package fr.tableaux;

public class ExerciceDeclarationTab {

    public static void main(String[] args) {

    // EXERCICE : DECLARATION DE BASE

        int[] tableauAvecDesEntiers = new int[]{8, -7, 12, 1, -2, 14, 17, 9};

        System.out.println(tableauAvecDesEntiers[0]);

        System.out.println(tableauAvecDesEntiers.length);

        System.out.println(tableauAvecDesEntiers[tableauAvecDesEntiers.length-1]);

        // System.out.println(tableauAvecDesEntiers[10]); Le tableau ne contient pas d'index 10, il a une longueur de 8 seulement.

    }
}
