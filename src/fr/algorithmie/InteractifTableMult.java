package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un nombre ?");
        int nombre = scanner.nextInt();
        int multiple = 1;
        System.out.println("La table de " + nombre + ":");
        while(multiple <=10){
            System.out.println( nombre + "*" + multiple + "=" + (nombre * multiple ));
            multiple += 1;
        }



    }
}
