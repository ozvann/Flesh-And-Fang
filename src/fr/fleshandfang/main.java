package src.fr.fleshandfang;


import src.fr.fleshandfang.cli.interaction;


public class main {
    public static void main(String[] args) {
        private int choix;
        System.out.println("-----------------------------\n\n");
        System.out.println("Bienvenue dans Flesh and Fang");
        System.out.println("1. Nouvelle partie");
        System.out.println("2. Charger une partie");
        System.out.println("3. Quitter");
        System.out.println("4. Test");
        System.out.println("\n Choisisser une option : ");
        new interaction();
        choix = interaction.interaction();
        if (choix == 1) {
            // Code pour démarrer une nouvelle partie
        } else if (choix == 2) {
            // Code pour charger une partie
        } else if (choix == 3) {
            System.out.println("Au revoir !");
            System.exit(0);
        } else if (choix == 4) {
            // Code pour la page test
        }
    }
}