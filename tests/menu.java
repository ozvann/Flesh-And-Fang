import interaction;

public class menu {
    public static void menu () {
        System.out.println("-----------------------------\n\n");
        System.out.println("Voici la page test.");
        System.out.println("1. Test combat");
        System.out.println("2. Test shop");
        System.out.println("3. Test crafting");
        System.out.println("4. Test sauvegarde");
        System.out.println("5. Test Chargement");
        System.out.println("6. Test interaction");
        System.out.println("7. Test inventaire");
        new interaction();
        private int choix = interaction.interaction();
        if (choix == 1) {
            new combat();
            // Code pour le test combat
        } else if (choix == 2) {
            new shop();
            // Code pour le test shop
        } else if (choix == 3) {
            new crafting();
            // Code pour le test crafting
        } else if (choix == 4) {
            new sauvegarde();
            // Code pour le test sauvegarde
        } else if (choix == 5) {
            new chargement();
            // Code pour le test chargement
        } else if (choix == 6) {
            new dialogue();
            // Code pour le test interaction
        } else if (choix == 7) {
            new inventaire();
            // Code pour le test inventaire
        }
    }
}