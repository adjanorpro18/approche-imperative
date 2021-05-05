package fr.algorithmie;

import java.util.Scanner;

public class InrteractifPlusGrand {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nb;
        int max = 0; //random value
        int compteur = 1;

        while(compteur <=10)
        {
            System.out.println("Entrez le " + compteur  +"e nombre : ");
            nb=scanner.nextInt();

            if(compteur  == 1) //1er tour de boucle
            {
                max = nb;
            }
            else if(nb>max)
                max = nb;

            compteur++;
        }

        System.out.print("Le nombre max est : " + max + "\n");
    }
}
