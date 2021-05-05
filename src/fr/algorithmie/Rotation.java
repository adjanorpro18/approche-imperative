package fr.algorithmie;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {

        //      declaration des tableaux via l'interface utilisateur
       // Scanner scan = new Scanner(System.in);
        //System.out.println("Quelle est la taille de votre tableau?");
        //int size = scan.nextInt();
        //int[] tab = new int[size];
        //for (int i = 0; i < size; i++) {
           // Scanner scanner = new Scanner(System.in);
            //System.out.println("Quelle est la valeur de l'index "+ i + "?");
           // tab[i] = scanner.nextInt();
        //}
        //int temp = tab[size -1];
        //for (int i = size-1; i > 0; i--) {
        //    tab[i] = tab[i-1];
        //}
       // tab[0] = temp;
       // for (int i = 0; i < size; i++) {
        //    System.out.println(tab[i]);
        //}

        int[] myArray = {1, 2, 3, 4};
        int[] myTempArray = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            myTempArray[(i+1) % myArray.length] = myArray[i];
        }

        for (int i : myTempArray) {
            System.out.println(i);
        }

    }

}
