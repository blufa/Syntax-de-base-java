package Introduction;

import java.util.Scanner;

public class Exercice2 {
    
    /*
     * Écrivez un programme pour saisir la
     *  longueur et la largeur d'un rectangle et calculer son périmètre.
     */

    public static void main(String[] variables) {
        Scanner clavier = new Scanner(System.in);
 
        float longueur, largeur, perimetre;
 
        // Fournir les données d'entrée 
        System.out.print("Saisir la longueur : ");
        longueur = clavier.nextFloat();
        clavier.nextLine(); // récupérer le caractère de touche Entrée abandonné
 
        System.out.print("Saisir la largeur : ");
        largeur = clavier.nextFloat();
        clavier.nextLine();
 
        // Calculer le perimètre 
        perimetre = 2 * (longueur + largeur);
 
        // Afficher le résultat
        System.out.println("le périmètre = " + perimetre);
 
        // fermer les ressources
        clavier.close();
    }
}
