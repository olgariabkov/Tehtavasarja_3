import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tehtava1b {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> luvut = new ArrayList<>();

        System.out.println("Syötä luku (-99 lopettaa)");
        //kysytään lukuja käyttäjältä

        int syote = 0;
        //syötteiden lukeminen, kunnes syöttää -99
        while (syote != -99) {
            syote = lukija.nextInt();
            if (syote != -99) {
                luvut.add(syote); //lisää syöte listaan
            }
        }


        //lasketaan summa
        int summa = 0;
        //int indeksi = 0;

        int pienin = luvut.get(0);
        int suurin = luvut.get(0);

        //käydään lista läpi
        //while
        /*while (indeksi < luvut.size()) {
            int luku = luvut.get(indeksi); //haetaan listan luku
            summa += luku;//lisätään luku summaan

            //onko luku pienempi
            if (luku < pienin) {
                pienin = luku;
            }
            //onko liku suurempi
            if (luku > suurin) {
                suurin = luku;
            }

            indeksi++;
        } */
/*
        //for
        for (int i = 0; i < luvut.size(); i++) {
            int luku = luvut.get(i);
            summa += luku;

            if (luku < pienin) {
                pienin = luku;
            }
            if (luku > suurin) {
                suurin = luku;
            }
        } */

        //for-each
        for (int luku : luvut) {
            summa += luku;

            if (luku < pienin) {
                pienin = luku;
            }
            if (luku > suurin) {
                suurin = luku;
            }
        }
        //lasketaan keskiarvo
        double keskiarvo = summa / (double) luvut.size();

        //tulostetaan tulokset
        System.out.println("Summa: " + summa);
        System.out.println("Keskiarvo: " + keskiarvo);
        System.out.println("Pienin: " + pienin);
        System.out.println("Suurin: " + suurin);

    }
}
