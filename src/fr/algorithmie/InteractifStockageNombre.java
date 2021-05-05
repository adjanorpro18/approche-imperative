package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int[] array = new int[1];
        int n = 0;
        while (n >= 0)
        {
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            System.out.print("Choisissez une option : ");
            int choice = scan.nextInt();

            switch (choice)
            {
                case 1:
                {
                    System.out.print("Entrez un nombre à ajouter : ");
                    int nb = scan.nextInt();

                    if(n == 0) //1er ajout : pas besoin d'augmenter taille tableau
                    {
                        array[0] = nb;
                    }
                    else
                    {

                        array = Arrays.copyOf(array, array.length+1);
                        array[array.length-1] = nb;
                    }
                    n++;
                    break;
                }

                case 2:
                {
                    System.out.println("Nombres existants :");
                    for (int elem : array) {
                        System.out.print(elem + " ");
                    }
                    System.out.println();
                    break;
                }
            }
            System.out.println("\n");
        }

    }
}
