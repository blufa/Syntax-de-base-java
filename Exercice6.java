package Introduction;

import java.util.Scanner;

public class Exercice6 {
    
    /*
     * Écrivez un programme pour saisir un nombre et calculer sa racine carrée.
     */
    public static void main(String[] variables) {
        Scanner clavier = new Scanner(System.in);
 
        double nb, racine;
 
        // Fournir les données d'entrée 
        System.out.print("Saisir un nombre : ");
        nb = clavier.nextDouble();
 
        // Calculer la racine 
        racine = Math.sqrt(nb);
 
        // Afficher le résultat 
        System.out.println("La racine carrée du " + nb + " = " + racine);
 
        // fermer les ressources
        clavier.close();
    }
}
