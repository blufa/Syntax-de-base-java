package Introduction;

import java.util.Scanner;

public class Exercice7 {
    /*
     * Écrivez un programme pour saisir la base et la hauteur 
     * d'un triangle et trouver la surface du triangle donné.
     */

    public static void main(String[] variables) {
        Scanner clavier = new Scanner(System.in);
 
        float base, hauteur, surface;
 
        // Fournir les données d'entrée
        System.out.print("Saisir la base : ");
        base = clavier.nextFloat();
 
        System.out.print("Saisir la hauteur: ");
        hauteur = clavier.nextFloat();
 
        // Calculer la surface
        surface = (base * hauteur) / 2;
 
        // Afficher le résultat
        System.out.println("La surface est = " + surface);
 
        // fermer les ressources
        clavier.close();
    }
}
