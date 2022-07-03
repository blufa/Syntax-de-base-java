package Introduction;

import java.util.Scanner;

public class Exercice14 {
    /*
     * Écrivez un programme pour entrer le numéro du jour de la semaine (1-7) et affichez le nom du jour de la semaine correspondant en utilisant if-else.
     */

    public static void main(String[] variables) {
        Scanner clavier = new Scanner(System.in);
 
        int jour;
 
        // Fournir les données d'entrée
        System.out.print("Saisir le numéro de jour ");
        jour = clavier.nextInt();
 
        if (jour == 1) {
            System.out.println("Lundi");
        } else if (jour == 2) {
            System.out.println("Mardi");
        } else if (jour == 3) {
            System.out.println("Mercredi");
        } else if (jour == 4) {
            System.out.println("Jeudi");
        } else if (jour == 5) {
            System.out.println("Vendredi");
        } else if (jour == 6) {
            System.out.println("Samedi");
        } else if (jour == 7) {
            System.out.println("Dimanche");
        } else {
            System.out.println("Entrée invalide! Veuillez saisir le numéro de jour entre 1 et 7.");
        }
 
        // fermer les ressources
        clavier.close();
    }
}
