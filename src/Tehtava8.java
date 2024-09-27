import java.io.FileNotFoundException;

public class Tehtava8 {

    public static void main(String[] args) {
        Esiintyja esin1 = new Esiintyja("Ralf", 30, "Pop", "18.00", "00.00");
        Esiintyja esin2 = new Esiintyja("Lucinda", 23, "Rock", "21.00", "02.00");

        Tyontekija emp1 = new Tyontekija("John", "Äänitekniikko", 6);
        Tyontekija emp2 = new Tyontekija("Sarah", "Jörjestyksevalvoja", 9);

        printArtistsInfo(esin1);
        printArtistsInfo(esin2);

        System.out.println(esin1.getName());
        //System.out.println(esin1);

        System.out.println(esin1.toString());
        //System.out.println(esin2);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());

        // luodaan festari, jolle annetaan nimi
        Festarit festarit = new Festarit("Fest");
        System.out.println(festarit);

        // tulee työntekijöitä
        // tapa 1
        festarit.addEmployee(emp1);
        festarit.addEmployee(emp2);
        System.out.println(festarit);

        // tapa 3
        // luetaan käyttäjän tiedot näppäimistöltä, sen jälkeen olion luonti ja lisäys
        Tyontekija emp4 = festarit.kysyEmpTiedot();
        festarit.addEmployee(emp4);
        System.out.println(festarit);

        Tyontekija emp5 = festarit.kysyEmpTiedot();
        festarit.addEmployee(emp5);
        System.out.println(festarit);

        // tapa 2
        // luetaan tiedot tiedostosta. Sen jälkeen lisäys
        try {
            Tyontekija emp3 = festarit.lueEmpTiedostosta();
            festarit.addEmployee(emp3);
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
        }

        // Puistosta poistetaan työntekijä
        festarit.removeEmployee(emp2);
        System.out.println(festarit);



        // Puistoon tulee dinoja
        festarit.addEsiintyja(esin1);
        festarit.addEsiintyja(esin2);
        System.out.println(festarit);
        festarit.addEsiintyja(esin1);
        festarit.addEsiintyja(esin2);
        System.out.println(festarit);
        festarit.addEsiintyja(esin1);
        festarit.addEsiintyja(esin2);
        System.out.println(festarit);

        // Festarista poistetaan esiintyjä
        festarit.removeArtist(-1);
        festarit.removeArtist(2);
        System.out.println(festarit);
        festarit.removeArtist(2);
        System.out.println(festarit);
    }

    public static void printArtistsInfo(Esiintyja esiintyja) {
        System.out.println("E name: " + esiintyja.getName());
        System.out.println("E age: " + esiintyja.getAge());
        System.out.println("E species: " + esiintyja.getGenre());
    }
}
