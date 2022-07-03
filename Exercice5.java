package Introduction;

import java.util.Scanner;

public class Exercice5 {
    
    /*
     * Écrivez un programme pour saisir 
     * deux nombres de l'utilisateur et trouvez leur puissance.
     */

    public static void main(String[] variables) {
        Scanner clavier = new Scanner(System.in);
 
        double base, expo, puissance;
 
        // Fournir les données d'entrée 
        System.out.print("Saisir la base : ");
        base = clavier.nextDouble();
 
        System.out.print("Saisir l'exposant : ");
        expo = clavier.nextDouble();
 
        // calculer la puissance 
        puissance = Math.pow(base, expo);
 
        // Afficher le résultat 
        System.out.println(base + " ^ " + expo + " = " + puissance);
 
        // fermer les ressources
        clavier.close();
    }
}
