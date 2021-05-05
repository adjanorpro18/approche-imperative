package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {

        int [] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        //Afficher l'ensemble des deux tableaux
        System.out.println("Les valeurs du tableau array: ");
        for(int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }

        //Créer un tableau arrayCopy et y copier les elements de array  dans l'ordre inverse

        int [] arrayCopy = new int[array.length];

        for(int j = 0; j< array.length/2; j++){
            int inverse = array[j];
            array[j] = array[array.length - j -1];
            array[array.length -j -1] = inverse;
        }
        System.out.println("Les valeurs du tableau arrayCopy: ");
        for(int j = 0; j < array.length; j++){
            arrayCopy[j] = array[j];
            System.out.println(arrayCopy[j]);
        }

    }
}
