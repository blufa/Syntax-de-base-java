package Introduction;

import java.util.Scanner;

public class Exercice13 {
    /*
     * Écrivez un programme pour vérifier si un alphabet est une voyelle ou une consonne en utilisant if-else.
        Les lettres a, e, i, o et u en minuscules et en majuscules sont appelées voyelles. Les alphabets autres que les voyelles sont appelés consonnes.
     */

    public static void main(String[] variables) {
        Scanner clavier = new Scanner(System.in);
 
        char ch;
 
        // Fournir les données d'entrée
        System.out.print("Saisir une lettre ");
        ch = clavier.next().charAt(0);
 
        // Tester si ch est voyelle */
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println(ch + " est voyelle.");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            /* consonnes */
            System.out.println(ch + " consonnes.");
        } else {
            // Ni voyelle ni consonne
            System.out.println(ch + " autres.");
        }
 
        // fermer les ressources
        clavier.close();
    }
}
