package Introduction;

import java.util.Scanner;

public class Exercice1{
  
    /*
     * Écrivez un programme pour saisir deux nombres de l'utilisateur et calculer leur somme. L'utilisateur doit donc entrer deux valeurs,
     *  puis le programme calcule leur somme
     */
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        int nb1, nb2, somme;

        // Fournir les données d'entrée 
        System.out.print("Saisir le premier nombre : ");
        nb1 = clavier.nextInt();
        clavier.nextLine(); // récupérer le caractère de touche Entrée abandonné
 
        System.out.print("Saisir le deuxième nombre :");
        nb2 = clavier.nextInt();
        clavier.nextLine();
 
        // calculer la somme
        somme = nb1 + nb2;
 
        // Afficher le résultat
        System.out.println("la somme = " + somme);
 
        // fermer les ressources
        clavier.close();
    }
}