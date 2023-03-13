import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // wczytanie liczby
        System.out.println("Podaj liczbe: ");
        int n = scanner.nextInt();

        // algorytm do obliczania silni
        int silnia = 1;
        for (int i = 1; i <= n; i++) {
            silnia *= i;
        }
        System.out.println(n + "! = " + silnia);

        // obliczanie sumy ciągu
        double suma = 0.0;
        for (int i = 1; i <= n; i++) {
            double ciag = 1.0 / (i + n);
            // System.out.println("dodatni: "+ ciag + " i: " + i);
            if (i % 2 == 0) {
                ciag *= -1; // zmiana znaku wyrazów o parzystym indeksie
                // System.out.println("ujemny: "+ ciag + " i: " + i);
            }
            suma += ciag;
        }
        System.out.println("Suma ciagu = " + suma);

        scanner.close();
    }
}
