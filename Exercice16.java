package Introduction;

import java.util.Scanner;

public class Exercice16 {
    /*
     * Écrivez un programme pour saisir le prix de fabrication et le prix de vente d'un produit et vérifiez le profit ou la perte.
        Si le prix de fabrication est supérieur au prix de vente, il y a perte sinon profit.
     */

    public static void main(String[] variables) {
        Scanner clavier = new Scanner(System.in);
 
        double pf, pv, montant;
 
        // Fournir les données d'entrée
        System.out.print("Saisir le prix de fabrication : ");
        pf = clavier.nextDouble();
 
        System.out.print("Saisir le prix de vente : ");
        pv = clavier.nextDouble();
 
        if (pv > pf) {
            // calculer le profit */
            montant = pv - pf;
            System.out.print("Profit = " + montant);
        } else if (pf > pv) {
            // Calculer la perte */
            montant = pf - pv;
            System.out.print("Perte = " + montant);
        } else {
            // Ni profit ni perte */
            System.out.print("Ni profit ni perte.");
        }
 
        // fermer les ressources
        clavier.close();
    }
}
