
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Zadanie8 {
    public static void main(String[] args) throws IOException {
//      0.
        String tekst1 = "Ala ma kota,\n a kot ma ale\n a pies ma kota";

        System.out.println(tekst1);

//    1. Napisz metodę sprawdzającą czy słowo jest palindromem - od początku i od końca czyta się go tak samo
//          ala -> true
//          kajak -> true
//          kot -> false
//        System.out.println(czyJestPalindromem("kotek"));

//        2.
//        Policz ile linii ma książka.
//        Policz ile razy występuje słowo "dolor"
        Path plikKsiazka = Path.of(System.getProperty("user.dir") + "/src/ksiazka.txt");
        System.out.println(System.getProperty("user.dir"));
        String text = Files.readString(plikKsiazka);
//        System.out.println(text);

//        Stream<String> lbLinii = text.lines();  // nie rozumiem jeszcze działania Stream
//        System.out.println(lbLinii.count() + 1);
//        System.out.println(lbLinii);

        String[] split = text.split("\n");
        int liczbaLinii = split.length + 1;
        System.out.println("książka ma " + liczbaLinii + " linii");
        System.out.println("Słowo \"dolor\" występuje " + policzSlowa(split, "dolor"));






    }

    public static boolean czyJestPalindromem(String slowo) {
        int licznik = 0;
        for (int i = 0; i < slowo.length() / 2; i++) {
            if (slowo.charAt(i) != slowo.charAt(slowo.length() - 1 - i)) {
                licznik++;
                break;
            }
        }
        if (licznik != 0) {
            return false;
        } else return true;
    }

    public static int policzSlowa (String[] tablicaString, String szukaneSlowo ) {
        int liczbaPowtorzen = 0;
        for (String pojedynczaLinia : tablicaString) {
            while (pojedynczaLinia.contains(szukaneSlowo)) {
                liczbaPowtorzen++;
                pojedynczaLinia = pojedynczaLinia.substring(pojedynczaLinia.indexOf(szukaneSlowo) + szukaneSlowo.length());
            }
        }
        return liczbaPowtorzen;
    }


}


