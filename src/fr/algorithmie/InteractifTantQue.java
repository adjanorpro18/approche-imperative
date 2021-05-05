package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {

        System.out.println("Saisissez un nombre?");
        Scanner scanner = new Scanner(System.in);
         int nombre = scanner.nextInt();

         while( nombre <1 || nombre > 10){
             System.out.println("Saisissez à nouveau un nombre?");
             nombre = scanner.nextInt();
         }
        System.out.println("Le nombre saisi est " + nombre);

    }
}
