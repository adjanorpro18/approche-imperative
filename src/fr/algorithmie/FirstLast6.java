package fr.algorithmie;

import java.util.Scanner;

public class FirstLast6 {
    public static void main(String[] args) {

        int [] entiers = { 6, 11, 8, 9, 112, 6};
        boolean bol = false ;
        bol =  entiers!= null && (entiers[0] ==6 || entiers[entiers.length - 1] == 6);

        System.out.println("La valeur du boolean est éagale:" + bol);
    }

}
