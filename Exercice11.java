package Introduction;

import java.util.Scanner;

public class Exercice11 {
    /*
     * Écrivez un programme pour vérifier si un nombre est divisible 
     * par 3 et 13 ou non, en utilisant if-else.
     */

    public static void main(String[] variables) {
        Scanner clavier = new Scanner(System.in);
 
        int nb;
 
        // Fournir les données d'entrée
        System.out.print("Saisir un nombre ");
        nb = clavier.nextInt();
 
        if ((nb % 3 == 0) && (nb % 13 == 0)) {
            System.out.println(nb + " est divisible par 3 et 13");
        } else {
            System.out.println(nb + " n'est divisible par 3 ni 13");
        }
 
        // fermer les ressources
        clavier.close();
    }
}
