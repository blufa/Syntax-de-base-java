package Introduction;

import java.util.Scanner;

public class Exercice4 {
    
    /*
     * Écrivez un programme pour saisir le nombre de jours de l'utilisateur 
     * et convertissez-le en années, semaines et jours.
     */

    public static void main(String[] variables) {
        Scanner clavier = new Scanner(System.in);
 
        int jours, annees, semaines;
 
        // Fournir les données d'entrée
        System.out.print("Saisir le nombre de jours : ");
        jours = clavier.nextInt();
 
        // Conversion
        annees = (jours / 365);
        semaines = (jours % 365) / 7;
        jours = jours - ((annees * 365) + (semaines * 7));
 
        // afficher le résultat
        System.out.println(annees + " an(s)");
        System.out.println(semaines + " semaine(s)");
        System.out.println(jours + " jour(s)");
 
        // fermer les ressources
        clavier.close();
    }
}
