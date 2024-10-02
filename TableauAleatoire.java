import java.util.Random;
import java.util.Scanner;

public class TableauAleatoire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        int[] tableau = new int[taille];


        for (int i = 0; i < taille; i++) {
            tableau[i] = random.nextInt(101); 
        }

        System.out.print("Tableau : ");
        for (int nombre : tableau) {
            System.out.print(nombre + " ");
        }
        System.out.println();


        int min = tableau[0];
        int max = tableau[0];
        int somme = 0;

        for (int nombre : tableau) {
            if (nombre < min) {
                min = nombre;
            }
            if (nombre > max) {
                max = nombre;
            }
            somme += nombre;
        }

        double moyenne = (double) somme / taille;
        System.out.println("Valeur minimale : " + min);
        System.out.println("Valeur maximale : " + max);
        System.out.println("Moyenne : " + moyenne);
        scanner.close();
    }
}
