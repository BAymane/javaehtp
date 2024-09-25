
import java.util.Scanner;

public class resolutiondéquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lecture des coefficients a, b et c
        System.out.print("Entrez le coefficient a : ");
        double a = scanner.nextDouble();
        System.out.print("Entrez le coefficient b : ");
        double b = scanner.nextDouble();
        System.out.print("Entrez le coefficient c : ");
        double c = scanner.nextDouble();

        // Calcul du discriminant
        double delta = b * b - 4 * a * c;

        // Résolution selon la valeur de delta
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Les solutions réelles sont : x1 = " + x1 + " et x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Il y a une solution double : x = " + x);
        } else {
            // Cas où delta < 0 : solutions complexes
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);
            System.out.println("Les solutions complexes sont : ");
            System.out.println("x1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("x2 = " + realPart + " - " + imaginaryPart + "i");
        }

        scanner.close();
    }
}
