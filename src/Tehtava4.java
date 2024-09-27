import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tehtava4 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String filename = "Football_statistics.txt"; //tiedoston nimi

        //kysytään joukkuen nimi
        System.out.println("Syötä joukkueen nimi: ");
        String joukkue = lukija.nextLine();

        int voitot = 0;
        int tappiot = 0;
        int tasapelit = 0;

        try {
            //luetaan tiedosto
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);

            //käydään läpi tiedoston rivit
            while (fileScanner.hasNextLine()) {
                String rivi = fileScanner.nextLine();
                String[] osat = rivi.split(","); //erotellaan tiedot ,

                String kotijoukkue = osat[0].trim();
                String vierasjoukkue = osat[1].trim();
                int kotipisteet = Integer.parseInt(osat[2].trim());
                int vieraspisteet = Integer.parseInt(osat[3].trim());

                //jos on kotijoukkue
                if (joukkue.equalsIgnoreCase(kotijoukkue)) {
                    if (kotipisteet > vieraspisteet) {
                        voitot++;
                    } else if (kotipisteet < vieraspisteet) {
                        tappiot++;
                    } else {
                        tasapelit++;
                    }
                }

                //jos on vierasjoukkue
                if (joukkue.equalsIgnoreCase(vierasjoukkue)) {
                    if (vieraspisteet > kotipisteet) {
                        voitot++;
                    } else if (vieraspisteet < kotipisteet) {
                        tappiot++;
                    } else {
                        tasapelit++;
                    }
                }
            }

            //tulostetaan tulokset
            System.out.println("Joukkue: " + joukkue);
            System.out.println("Voitot: " + voitot);
            System.out.println("Tappiot : " + tappiot);
            System.out.println("Tasapelit : " + tasapelit);

            //suljetaan tiedoston lukija
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        lukija.close();
    }
}
