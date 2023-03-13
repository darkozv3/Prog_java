import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ile przedmiotow chcesz podac?: ");
        int ilePrzedmioty = scanner.nextInt();

        double suma = 0;
        for (int i = 0; i < ilePrzedmioty; i++) {
            System.out.print("Podaj nazwe przedmiotu: " + (i + 1) + ": ");
            String nazwaPrzedmiotu = scanner.next();

            System.out.print("Ile ocen chcesz podac z przedmiotu " + nazwaPrzedmiotu + "?: ");
            int iloscOcen = scanner.nextInt();

            double sumaOcen = 0;
            for (int j = 0; j < iloscOcen; j++) {
                System.out.print("Podaj ocene " + (j + 1) + " z przedmiotu " + nazwaPrzedmiotu + ": ");
                double ocena = scanner.nextDouble();
                sumaOcen += ocena;
            }

            double sredniaPrzedmiotu = sumaOcen / iloscOcen;
            System.out.println("Srednia ocen z przedmiotu " + nazwaPrzedmiotu + ": " + sredniaPrzedmiotu);
            suma += sredniaPrzedmiotu;
        }

        double srednia = suma / ilePrzedmioty;
        System.out.println("Srednia ogolna: " + srednia);

        if (srednia > 4.1) {
            System.out.println("Studentowi przysluguje stypendium naukowe.");
        } else {
            System.out.println("Studentowi nie przysluguje stypendium naukowe.");
        }
    }
}
