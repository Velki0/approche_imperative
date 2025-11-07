package fr.operateurs.variable;

public class DeclarationApp {
    public static void main(String[] args) {
        byte a = (byte) 127;
        short b = (short) 127;
        int c = (int) 127;
        long d = (long) 127;
        float e = (float) 127;
        double g = (double) 127;
        char f = (char) 127;
        String h = "Hello World!";

        System.out.println(h);

        String randomString = "Voici le résultat d’un calcul : 1+5=6";
        System.out.println(randomString);
        randomString = "Voici le résultat d’un calcul :\n1+5=6";
        System.out.println(randomString);
    }
}
