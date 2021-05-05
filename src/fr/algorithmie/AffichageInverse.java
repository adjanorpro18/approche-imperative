package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {

        int [] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Affichage des elements du tableaux avec une boucle

        System.out.println("tableau dans l'ordre");
        for(int i =0; i < array.length; i++){
            System.out.println(array[i] + "");
        }
        System.out.println("\n");

        //Affichage des élements dans l'ordre inverse
        System.out.println("tableau inversé");
        for(int i= array.length -1; i >=0; i--)
        {
            System.out.println(array[i] + "");
        }
        System.out.println("\n");

        //Créer un tableau puis copier les élements de array dedans

        int [] arrayCopy = new int[array.length];

        for(int i = 0; i< array.length; i++)
        {
            arrayCopy[i] = array[i];
        }

        System.out.println(" le contenu de la copie du tableau est :");
        for(int i = 0; i< array.length; i++){
            System.out.println(arrayCopy[i] + "");
        }
    }
}
