package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {

        int[] array = {4, -2, 0, 112, 4};
        boolean bol = false;

        bol = array.length>=1 && array[0] == array[array.length-1];
        System.out.println("valeur booléen  ets égale à : " + bol);

    }
}