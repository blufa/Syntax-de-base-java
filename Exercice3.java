package Introduction;

import java.util.Scanner;

public class Exercice3 {
    

    /*
     * Écrivez un programme pour saisir la longueur en centimètres 
     * et convertissez-le en mètres et en kilomètres.
     */
    public static void main(String[] variables) {
        Scanner clavier = new Scanner(System.in);
 
        float cm, metre, km;
 
        // fournir la longueur en cm 
        System.out.print("Saisir la longueur en centimètres : ");
        cm = clavier.nextFloat();
 
        // Convertir en m et km
        metre = cm / 100;
        km = cm / 100000;
 
        // Afficher le résultat 
        System.out.println("Longueur en mètres = " + metre + " m \n");
        System.out.println("Longueur en Kilomètres = " + km + " km");
 
        // fermer les ressources
        clavier.close();
    }
}
