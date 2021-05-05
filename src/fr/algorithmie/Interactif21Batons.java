package fr.algorithhmie;

import java.util.Scanner;

public class Interactif21Batons
{
    public static int RandomInt(int min, int max)
    {
        return (int) (Math.random()*((max-min) +1)) + min;
    }

    public static int RandIAChoice(int batons)
    {
        int choice = 0;
        if(batons >= 3){
            choice = RandomInt(1, 3);
        }
        else if(batons == 2){
            choice = RandomInt(1,2);
        }
        else if (batons == 1){
            choice = 1;
        }
        return choice;
    }

    public static int PerfectIAChoice(int batons, int previousPlayerChoice)
    {
        int choice;
        if(batons>=4)
            choice = 4 - previousPlayerChoice;
        else
            choice = batons-1;

        return choice;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean isPlayerTurn = true;
        int batons = 21;
        int choixJoueur = 0;
        int choixIA;

        boolean isIAPerfect = true;

        System.out.println("****** Jeu de Nim ******");
        String answer = "";
        while(!answer.equals("y") && !answer.equals("n"))
        {
            System.out.println("Activer mode difficile ? (y/n)");
            answer = scan.next();
            if(answer.equals("y")){
                isIAPerfect = true;
            }

            else if(answer.equals("n")){
                isIAPerfect = false;
            }
        }
        System.out.println();

        while(batons > 0)
        {
            System.out.println("Batons restants : " + batons);
            if(isPlayerTurn)
            {
                if(batons >= 3)
                    System.out.println("Retirer 1, 2 ou 3 batons ?");
                else if(batons == 2)
                    System.out.println("Retirer 1 ou 2 batons ?");
                else if (batons == 1)
                    System.out.println("Retirer 1 batons ?");

                choixJoueur = scan.nextInt();
                batons -= choixJoueur;

                if(batons==0)
                    break;

                isPlayerTurn = false;
            }
            else //IA Turn
            {
                if(isIAPerfect)
                    choixIA = PerfectIAChoice(batons, choixJoueur);
                else
                    choixIA = RandIAChoice(batons);

                System.out.println("Votre adversaire retire " + choixIA + " batons\n");
                batons -= choixIA;

                if(batons==0)
                    break;

                isPlayerTurn = true;
            }
        }

        System.out.println("Batons restants : " + batons);
        if(isPlayerTurn)
            System.out.println("Dommage vous avez perdu...");
        else
            System.out.println("Bravo vous avez gagné !");
    }
}
