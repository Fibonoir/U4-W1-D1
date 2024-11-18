import java.util.Scanner;

public class MathExercise {

    // Method to calculate the perimeter of a rectangle
    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    // Method to check if a number is even or odd
    public static int pariDispari(int numero) {
        return (numero % 2 == 0) ? 0 : 1;
    }

    // Method to calculate the area of a triangle using Heron's formula
    public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
        double semiPerimetro = (lato1 + lato2 + lato3) / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - lato1) * (semiPerimetro - lato2) * (semiPerimetro - lato3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rectangle perimeter calculation
        System.out.println("Inserisci la lunghezza del primo lato del rettangolo:");
        double lato1Rettangolo = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del secondo lato del rettangolo:");
        double lato2Rettangolo = scanner.nextDouble();
        double perimetroRett = perimetroRettangolo(lato1Rettangolo, lato2Rettangolo);
        System.out.println("Il perimetro del rettangolo è: " + perimetroRett);

        // Check if a number is even or odd
        System.out.println("Inserisci un numero intero:");
        int numero = scanner.nextInt();
        int risultatoPariDispari = pariDispari(numero);
        System.out.println("Il numero è " + (risultatoPariDispari == 0 ? "pari" : "dispari"));

        // Triangle area calculation
        System.out.println("Inserisci la lunghezza del primo lato del triangolo:");
        double lato1Triangolo = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del secondo lato del triangolo:");
        double lato2Triangolo = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del terzo lato del triangolo:");
        double lato3Triangolo = scanner.nextDouble();
        double areaTriangolo = perimetroTriangolo(lato1Triangolo, lato2Triangolo, lato3Triangolo);
        System.out.println("L'area del triangolo è: " + areaTriangolo);

        scanner.close();
    }
}