package fr.algorithme;

public class FirstLast6 {

    public static void main(String[] args) {

        int[] tableau = {} ;

        // 6 au début ou à la fin du tableau ?
        if (tableau.length > 0) {
            boolean is6atStartEnd = (tableau[0] == 6) || (tableau[tableau.length - 1] == 6) ? true : false;
            System.out.println(is6atStartEnd);
        } else  {
            boolean is6atStartEnd = false;
            System.out.println(is6atStartEnd);
        }
    }
}
