import java.util.Scanner;

public class NombresAmicaux {

    // Méthode pour calculer la somme des diviseurs propres
    public static int sommeDiviseursPropres(int n) {
        int somme = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                somme += i;
            }
        }
        return somme;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer deux nombres
        System.out.print("Entrez le premier nombre : ");
        int nombre1 = scanner.nextInt();
        System.out.print("Entrez le deuxième nombre : ");
        int nombre2 = scanner.nextInt();

        // Calcul des sommes des diviseurs propres
        int somme1 = sommeDiviseursPropres(nombre1);
        int somme2 = sommeDiviseursPropres(nombre2);

        // Vérification si les nombres sont amicaux
        if (somme1 == nombre2 && somme2 == nombre1) {
            System.out.println(nombre1 + " et " + nombre2 + " sont des nombres amicaux.");
        } else {
            System.out.println(nombre1 + " et " + nombre2 + " ne sont pas des nombres amicaux.");
        }

        scanner.close();
    }
}
