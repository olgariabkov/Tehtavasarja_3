import java.util.ArrayList;
import java.util.Scanner;

public class Tehtava2 {
    public static void main(String[] args) {

        //luodaan lista elokuville
        ArrayList<Elokuva> elokuvat = new ArrayList<>();

        //luodaan elokuvaolioita ja lisätään ne listaan
        elokuvat.add(new Elokuva("Interstellar", "Christopher Nolan", 2014, 12, "Sci-fi"));
        elokuvat.add(new Elokuva("Inception", "Christopher Nolan", 2010, 12, "Sci-fi"));
        elokuvat.add(new Elokuva("Parasite", "Bong Joon-ho", 2019, 16, "Draama"));
        elokuvat.add(new Elokuva("Tenet", "Christopher Nolan", 2020, 12, "Sci-fi"));

        //tulostetaan kaikki elokuvat
        System.out.println("Kaikki elokuvat: ");
        for (Elokuva elokuva : elokuvat) {
            System.out.println(elokuva);
        }

        //tulostetaan alle 5 vuotta vanhat
        tulostaUudet(elokuvat);

        //tulostetaan tietyn genren
        tulostaGenre(elokuvat);

    }

    //metodi jooka tulostaa alle 5 vuotta vanhat
    public static void tulostaUudet(ArrayList<Elokuva> elokuvat) {
        int nykyvuosi = 2024;
        System.out.println("Uudet elokuvat: ");
        for (Elokuva elokuva : elokuvat) {
            if (nykyvuosi - elokuva.getJulkaisuvuosi() < 5) {
                System.out.println(elokuva);
            }
        }
    }

    //metodi joka tulostaa tietyn genren
    public static void tulostaGenre(ArrayList<Elokuva> elokuvat) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna elokuvan genre: ");
        String haluttuGenre = lukija.nextLine();

        System.out.println("Elokuvat genrestä " + haluttuGenre + ":");
        for (Elokuva elokuva : elokuvat) {
            if (elokuva.getGenre().equalsIgnoreCase(haluttuGenre)) {
                System.out.println(elokuva);
            }
        }
    }
}
