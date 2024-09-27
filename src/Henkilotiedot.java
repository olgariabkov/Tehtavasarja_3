import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Henkilotieto> henkilot = new ArrayList<>();

        while (true) {
            //kysytään etunimi
            System.out.print("Syötä etunimi: ");
            String etunimi = lukija.nextLine();

            //jos etunimi on tyhjä, lopetetaan
            if (etunimi.isEmpty()) {
                break;
            }

            //kysytään sukuniimi ja ikä
            System.out.println("Syötä sukunimi: ");
            String sukunimi = lukija.nextLine();
            System.out.println("Syötä ikä: ");
            int ika = Integer.parseInt(lukija.nextLine());

            //luodaan olio
            Henkilotieto henkilo = new Henkilotieto(etunimi, sukunimi, ika);
            henkilot.add(henkilo);
        }

        //tulostetaan etu ja sukunimi
        System.out.println("Henkilöiden tiedot: ");
        for (Henkilotieto henkilo : henkilot) {
            System.out.println(henkilo.getEtunimi() + " " + henkilo.getSukunimi());
        }
    }
}
