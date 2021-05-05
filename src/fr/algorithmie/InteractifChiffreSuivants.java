package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffreSuivants {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre ?");
        int nombre = scanner.nextInt();

        int next = nombre;
        System.out.println("Les 10 nombres suivants sont : ");

        for(int i = 0; i<10; i++){
            next++;
            System.out.println(next);
        }

    }
}
