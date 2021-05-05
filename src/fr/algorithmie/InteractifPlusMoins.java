package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int alea = (int) (Math.random()*((100 -1) + 1)) +1;
        int choix = 0;
        int tentative = 0;

        System.out.println("************ BIENVENUE DANS LE JEU ***************");
        System.out.println("Un choix de nombre aléatoire entre 1 et 100 est choisi ! \n");
        System.out.println("Devinez ce nombre !\n" );

        while(choix != alea){
            System.out.println("Tentative n°" + tentative + ":");
            choix = scanner.nextInt();

            if(choix < alea){
                System.out.println("Oula, Dévinez un nombre plus grand \n");
            }
            else if(choix > alea){
                System.out.println("Mince, dévinez un nombre plus petit \n");
            }
            tentative ++;

        }
        System.out.println("Bravo, vous avez trouvé le nombre fétiche en " + tentative + " de coups!");

    }
}
