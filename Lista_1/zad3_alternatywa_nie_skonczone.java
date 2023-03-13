import java.util.Scanner;

class UTWOR {
    String autor;
    String wykonawca;
    int czasTrwania;

    UTWOR(String autor, String wykonawca, int czasTrwania) {
        this.autor = autor;
        this.wykonawca = wykonawca;
        this.czasTrwania = czasTrwania;
    }
}

class CD {
    String tytul;
    String wykonawca;
    String wydawca;
    int rokWydania;
    double cena;
    UTWOR[] utwory = new UTWOR[10];
    int liczbaUtworow = 0;

    CD(String tytul, String wykonawca, String wydawca, int rokWydania, double cena) {
        this.tytul = tytul;
        this.wykonawca = wykonawca;
        this.wydawca = wydawca;
        this.rokWydania = rokWydania;
        this.cena = cena;
    }

    void dodajUtwor(String autor, String wykonawca, int czasTrwania) {
        if (liczbaUtworow < 10) {
            utwory[liczbaUtworow++] = new UTWOR(autor, wykonawca, czasTrwania);
        }
    }

    void wyswietlUtwory() {
        for (int i = 0; i < liczbaUtworow; i++) {
            UTWOR utwor = utwory[i];
            System.out.println("Autor: " + utwor.autor);
            System.out.println("Wykonawca: " + utwor.wykonawca);
            System.out.println("Czas trwania: " + utwor.czasTrwania);
        }
    }

    void wyswietlInformacje() {
        System.out.println("Tytul albumu: " + tytul);
        System.out.println("Nazwisko wykonawcy: " + wykonawca);
        System.out.println("Nazwa wydawcy: " + wydawca);
        System.out.println("Rok wydania: " + rokWydania);
        System.out.println("Cena plyty: " + cena);
    }
}

class KOLEKCJA_PLYT {
    CD[] plyty = new CD[10];
    int liczbaPlyt = 0;

    void dodajPlyte(String tytul, String wykonawca, String wydawca, int rokWydania, double cena) {
        if (liczbaPlyt < 10) {
            plyty[liczbaPlyt++] = new CD(tytul, wykonawca, wydawca, rokWydania, cena);
        }
    }

    void wyswietlPlyty() {
        for (int i = 0; i < liczbaPlyt; i++) {
            CD plyta = plyty[i];
            System.out.println("-----------------------------");
            System.out.println("Plyta #" + (i+1));
            plyta.wyswietlInformacje();
            System.out.println("Lista utworow:");
            plyta.wyswietlUtwory();
            System.out.println("-----------------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        KOLEKCJA_PLYT kolekcja = new KOLEKCJA_PLYT();

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Witaj w kolekcji plyt!");
        System.out.println("Co chcesz zrobic?");
        System.out.println("1. Wyswietl liste plyt");
        System.out.println("2. Dodaj nowa plyte");
        System.out.println("3. Edytuj plyte");
        System.out.println("4. Dodaj nowe utwory");
        System.out.println("5. Edytuj utwory");
        System.out.println("6. Wyjdz z programu");
        
        int wybor = scanner.nextInt();
        scanner.nextLine(); // konsumujemy znak nowej linii
        
        while (wybor != 6) {
            switch (wybor) {
                case 1:
                System.out.println("Lista plyt:");
                kolekcja.wyswietlPlyty();
                break;
                case 2:
                if (kolekcja.liczbaPlyt < 10) {
                    System.out.println("Dodaj nowa plyte:");

                    System.out.print("Tytul: ");
                    String tytul = scanner.nextLine();

                    System.out.print("Wykonawca: ");
                    String wykonawca = scanner.nextLine();

                    System.out.print("Wydawca: ");
                    String wydawca = scanner.nextLine();

                    System.out.print("Rok wydania: ");
                    int rokWydania = scanner.nextInt();

                    scanner.nextLine(); // konsumujemy znak nowej linii
                    System.out.print("Cena: ");
                    double cena = scanner.nextDouble();

                    scanner.nextLine(); // konsumujemy znak nowej linii
                    kolekcja.dodajPlyte(tytul, wykonawca, wydawca, rokWydania, cena);
                    System.out.println("Plyta dodana do kolekcji!");

                } else {
                    System.out.println("Kolekcja jest pelna, nie mozesz dodac kolejnej plyty.");
                }
                break;
                case 4:
                System.out.println("Do ktorej plyty chcesz dodac utwor?: ");
                int indeksPlyty = scanner.nextInt();
                scanner.nextLine(); // konsumujemy znak nowej linii
                
                if (indeksPlyty >= 0 && indeksPlyty < kolekcja.liczbaPlyt) {
                    CD plyta = kolekcja.plyty[indeksPlyty];
                    
                    if (plyta.liczbaUtworow < 10) {
                        System.out.println("Dodaj nowy utwor:");
                
                        System.out.print("Autor: ");
                        String autor = scanner.nextLine();
                
                        System.out.print("Wykonawca: ");
                        String wykonawca = scanner.nextLine();
                
                        System.out.print("Czas trwania: ");
                        int czasTrwania = scanner.nextInt();
                
                        scanner.nextLine(); // konsumujemy znak nowej linii
                        plyta.dodajUtwor(autor, wykonawca, czasTrwania);
                        System.out.println("Utwór dodany do kolekcji!");
                    }else {
                    System.out.println("Maksymalna ilość, nie możesz dodać kolejnego utworu.");
                    }
                }
                break;
                default:
                System.out.println("Niepoprawna opcja.");
            }

        System.out.println("\nCo chcesz zrobic?");
        System.out.println("1. Wyswietl liste plyt");
        System.out.println("2. Dodaj nowa plyte");
        System.out.println("3. Edytuj plyte");
        System.out.println("4. Dodaj nowe utwory");
        System.out.println("5. Edytuj utwory");
        System.out.println("6. Wyjdz z programu");

        wybor = scanner.nextInt();
        scanner.nextLine(); // konsumujemy znak nowej linii
        }

    System.out.println("Do zobaczenia!");
    }
}
