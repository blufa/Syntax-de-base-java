package Introduction;

import java.util.Scanner;

public class Exercice9 {
    
    /*
     * Écrivez un programme pour trouver toutes les racines d'une équation quadratique en utilisant if-else.En algèbre,
     *  une équation quadratique est une équation sous la forme de  ax2+bx+c=0
     */

    public static void main(String[] variables) {
        Scanner clavier = new Scanner(System.in);
 
        float a, b, c;
        double r1, r2, imag;
        double discriminant;
 
        // Fournir les données d'entrée
        System.out.print("Saisir a : ");
        a = clavier.nextFloat();
 
        System.out.print("Saisir b : ");
        b = clavier.nextFloat();
 
        System.out.print("Saisir c : ");
        c = clavier.nextFloat();
 
        // calculer le discriminant */
        discriminant = (b * b) - (4 * a * c);
 
        if (discriminant > 0) {
            r1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
            r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
 
            System.out.println("Il existe deux racines réelles distinctes : " + r1 + " et " + r2);
        } else if (discriminant == 0) {
            r1 = r2 = -b / (2 * a);
 
            System.out.println("Il existe deux racines réelles doubles:  " + r1 + " et %.2f" + r2);
 
        } else if (discriminant < 0) {
            r1 = r2 = -b / (2 * a);
            imag = Math.sqrt(-discriminant) / (2 * a);
 
            System.out.println("Il existe deux racines complexes distinctes: " + r1 + " + i (" + imag + ") et " + r1
                    + " - i (" + imag + ")");
        }
 
        // fermer les ressources
        clavier.close();
    }
}
