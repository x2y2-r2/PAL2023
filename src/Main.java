import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
//       2. Priorytety operatorów
//        Jest cała tabelka:
//        https://introcs.cs.princeton.edu/java/11precedence/

//        liczba = 300;
//        byte bajcik = (byte) liczba;
//        System.out.println(bajcik);

//        3. Łańcuchy - String
        String powitanie = "Czesc";
        System.out.println(powitanie);

//        Wyciaganie kawalkow stringa
        String kawalek = powitanie.substring(0, 3); // od indeksu 0 do 3 ale bez indeksu 3
        System.out.println(kawalek);

//        utworz string "lubie placki" i zostwienie z niego tylko placki
        String lubie = "lubie placki";
        String placki = lubie.substring(6);
        System.out.println(placki);

//        skladanie wiele stringów
        String nieLadne = "brzydkie";
        String wyrazenie = "slowo";

        String wiadomosc = nieLadne + " " + wyrazenie;
        System.out.println(wiadomosc);

//        skladanie Stringa z nieStringiem
        int wiek = 18;
        String imie = "Ola";
        System.out.println(imie +" ma " + wiek +" lat ");

//      Znaki specjalne
        System.out.println("Ala ma kota \"Mruczka\" ");  // aby wstawić "" w stringu dajemy \"
        System.out.println("Ala ma kota \\ \"Mruczka\" "); // jeżeli wstawiamy \ to musimy dać \\
//        \ daje escape i pozwala wstawiac znaki specjalne
        System.out.println("\tLubi myszki \nale bardziej spac"); // \t tabulato \n nowa linia

//        Pusty lancuch
        String pusty = "";
        System.out.println(pusty.length() == 0); // sprawdzenie czy string jest pusy, czyli nie ma nic wpisane
        System.out.println(pusty.isEmpty()); // jeżeli wstawimy tam spacje do dostaniemy info ze "cos" tam jest

        String pusty2 = "  ";
        System.out.println(pusty2.isBlank()); // wyświetli True jeżeli są znaki niewidoczne np spacje, tab, itp

//        2. charAt
        String witaj = "elo";
        System.out.println(witaj);

        char znak = witaj.charAt(0);
        System.out.println(znak);

        String tekst = "Ala ma kota, a kot ma Ale";
        System.out.println(tekst.contains("ma"));

//  Zad 1. Ile razy w danym stringu występuje "ma"?
//        int ilosc = 0;
//        String ma = "ma";
//        while (tekst.contains(ma)) {
//            ilosc++;
//            int maIndex = tekst.indexOf(ma);
//            tekst = tekst.substring(maIndex + ma.length());
//        }
//        System.out.println("Ilosc \"ma\" " + ilosc);
        String[] split = tekst.split("ma");
        System.out.println(split.length - 1);




        System.out.println("=================");
//        // A co to to getProperty?
        Path fileName = Path.of(System.getProperty("user.dir") + "/src/test.txt");
        System.out.println("System.getProperty");
        System.out.println(System.getProperty("user.dir"));
        String text = Files.readString(fileName);
        System.out.println(text);


    }
}