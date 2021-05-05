package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {

    public static int CalculFibonnaci(int rang)
    {
        int result = 0;
        int[] fiboArray = new int[rang+1];

        //Init array
        fiboArray[0] = 0;
        fiboArray[1] = 1;

        for (int i = 2; i < fiboArray.length; i++) {
            fiboArray[i] = fiboArray[i-1] + fiboArray[i-2];
        }

        //Print fiboArray
        System.out.println("Suite de fibonnaci de rang " + rang);
        for (int elem : fiboArray) {
            System.out.print(elem + " ");
        }
        System.out.println("\n");

        result = fiboArray[rang];
        return result;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("****** Fibonnaci Interactif ******");
        System.out.println("Choisissez un rang N :");
        int n = scan.nextInt();

        int fibo = CalculFibonnaci(n);
        System.out.print("Le nombre de Fibonnaci de rang N=" + n + " est : " + fibo);
        System.out.println();
    }
}
