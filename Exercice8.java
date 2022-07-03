package Introduction;

import java.util.Scanner;

public class Exercice8 {
    
    /*
     * Écrivez un programme pour saisir les notes de cinq matières d'un élève et calculer le total, 
     * la moyenne et le pourcentage de toutes les matières.
     */

    public static void main(String[] variables) {
        Scanner clavier = new Scanner(System.in);
 
        float mat1, mat2, mat3, mat4, mat5;
        float total, moyenne, pourcentage;
 
        // Fournir les données d'entrée
        System.out.print("Saisir la 1ere note : ");
        mat1 = clavier.nextFloat();
 
        System.out.print("Saisir la 2eme note : ");
        mat2 = clavier.nextFloat();
 
        System.out.print("Saisir la 3eme note : ");
        mat3 = clavier.nextFloat();
 
        System.out.print("Saisir la 4eme note : ");
        mat4 = clavier.nextFloat();
 
        System.out.print("Saisir la 5eme note : ");
        mat5 = clavier.nextFloat();
 
        // Calculer la surface
        total = mat1 + mat2 + mat3 + mat4 + mat5;
        moyenne = total / 5;
        pourcentage = (total / 500) * 100;
 
        // Afficher le résultat
        System.out.println("Total = " + total);
        System.out.println("Moyenne = " + moyenne);
        System.out.println("Pourcentage = " + pourcentage);
 
        // fermer les ressources
        clavier.close();
    }
}
