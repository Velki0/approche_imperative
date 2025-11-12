package fr.algorithme;

public class FirstLast {

    public static void main(String[] args) {

        int[] tableau = {5, 9, 8, 6, 5};
        // 6 au début ou à la fin du tableau ?
        if (tableau.length > 0) {
            boolean is6atStartEnd = (tableau[0] == tableau[tableau.length - 1]);
            System.out.println(is6atStartEnd);
        } else {
            boolean is6atStartEnd = false;
            System.out.println(is6atStartEnd);
        }
    }
}
