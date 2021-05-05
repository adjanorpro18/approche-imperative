package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {


        int [] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        //Aficher que les entiers supérieurs à 3

        System.out.println("Les valeurs supérieures à 3");
        for(int i = 0; i< array.length; i++){
            if(array[i] > 3){
                System.out.println(array[i] + "");
            }
        }
        System.out.print('\n');

        //Aficher que les les valeurs paires

        System.out.println("Les valeurs paires");
        for(int i = 0; i< array.length; i++){
            if(array[i]  % 2 == 0){
                System.out.println(array[i] + " ");
            }
        }
        System.out.print('\n');

        //Aficher que les les valeurs => aux index impairs

        System.out.println("Les valeurs correspondant aux index paires");
        for(int i = 0; i< array.length; i+=2){
                System.out.println(array[i]);
            }

        System.out.print('\n');
        //Aficher que les les valeurs impaires

        System.out.println("Les valeurs impaires");
        for(int i = 0; i< array.length; i++){
            if(array[i]  % 2 != 0){
                System.out.println(array[i]);
            }

        }
        System.out.print('\n');
    }
}
