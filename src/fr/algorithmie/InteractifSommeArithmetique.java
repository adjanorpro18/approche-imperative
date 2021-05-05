package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre ?");
        int nombre = scanner.nextInt();
        int somme = 0;
        for(int i =1; i <= nombre;){
            somme = somme +i;
            i++;
        }
        System.out.println("La somme est des entiers compris entre 1 et ce nombre est  " + somme);

    }
}
