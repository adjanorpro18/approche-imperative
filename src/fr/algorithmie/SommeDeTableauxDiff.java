package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {

        int [] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int [] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
        /* Affichage array 1 et 2 */

        System.out.println("Tableau 1 : ");
        for (int i : array1) {
            System.out.print(i + " ");
        }


        System.out.println("\n\nTableau 2 : ");
        for (int i : array2) {
            System.out.print(i + " ");
        }
        /* *** */

        //Je copie l'intégralité du tableau 1 dans mon tableau sumArrayDiff
        int[] sumArrayDiff = array1;

        //J'ajoute le array2 en bouclant sur l'index de array2 qui est plus petit
        for (int i = 0; i < array2.length; i++) {
            sumArrayDiff[i] += array2[i];
        }

        //Affichage sumArray
        System.out.println("\n\nSomme des tableaux : ");
        for (int i = 0; i < sumArrayDiff.length; i++) {
            System.out.print(sumArrayDiff[i] + " ");
        }

    }
}
