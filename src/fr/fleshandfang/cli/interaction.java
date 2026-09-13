package src.fr.fleshandfang;


import java.util.Scanner;


public class interaction {
    public static int interaction () {
        private String choix;
        Scanner scanner = new Scanner(System.in);
        choix = scanner.nextLine();
        if (choix.equals("1")) {
            return 1;
        } else if (choix.equals("2")) {
            return 2;
        } else if (choix.equals("3")) {
            return 3;
        } else if (choix.equals("4")) {
            return 4;
        } else if (choix.equals("5")) {
            return 5;
        } else if (choix.equals("6")) {
            return 6;
        } else if (choix.equals("7")) {
            return 7;
        } else if (choix.equals("8")) {
            return 8;
        } else if (choix.equals("9")) {
            return 9;
        } else {
            System.out.println("Option invalide. Veuillez choisir une option valide (1-9).");
            return interaction();
        }
    }
}