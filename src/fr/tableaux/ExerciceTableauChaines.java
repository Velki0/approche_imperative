package fr.tableaux;

public class ExerciceTableauChaines {

    public static void main(String[] args) {

    // EXERCICE : DECLARATION ET MODIFICATION

        String[] tableauAvecDesVilles = new String[]{"Paris", "Lyon", "Marseille", "Montpellier", "Grenoble"};

        for (int index = 0; index < tableauAvecDesVilles.length; index++) {
            System.out.println(tableauAvecDesVilles[index]);
        }

        System.out.println(tableauAvecDesVilles.length);

        tableauAvecDesVilles[3] = "Reims";

        for (int index = 0; index < tableauAvecDesVilles.length; index++) {
            System.out.println(tableauAvecDesVilles[index]);
        }

    }
}
