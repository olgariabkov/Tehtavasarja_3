import java.util.ArrayList;
import java.util.Scanner;

public class Tehtava1 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> nimet = new ArrayList<>();

        //kysytään nimeä käyttäjältä
        while (true) {
            System.out.print("Syötä nimi: ");
            String nimi = lukija.nextLine();

            if (nimi.isEmpty()) {
                break;
            }

            nimet.add(nimi);
        }

        //tulostetaan
        //tapa1 while loop
        if (nimet.size() > 1) {
        int indeksi = 0;
        while (indeksi < nimet.size()) {
            if (indeksi == 1) {
            System.out.println(nimet.get(indeksi));
            break;
        }
            indeksi++;

        //tapa2 for loop
        /*if (nimet.size() > 1) {
            for (int i = 0; i < nimet.size(); i++) {
                if (i == 1) {
            System.out.println(nimet.get(i));
            break;
        } */

        //tapa3 for-each
        /*if (nimet.size() > 1) {
            int indeksi = 0;
            for (String nimi : nimet) {
                if (indeksi == 1) {
                    System.out.println(nimi);
                    break;
                }
                indeksi++; */
    }
} else {
    System.out.println("Listassa ei ole tarpeeksi nimiä");
}
}
}
