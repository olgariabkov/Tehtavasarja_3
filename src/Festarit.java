import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Festarit {

    String name; //Festarin nimi
    ArrayList<Tyontekija> employees; //Dynaaminen tietorakenne
    Esiintyja[] esiintyjat; // Staattinen tietorakenne

    int numberOfEmployees = 0;
    int numberOfArtists = 0;

    public Festarit(String name) {
        this.name = name;
        this.esiintyjat = new Esiintyja[4]; // Oletus artistien maksimimäärä on 4
        this.employees = new ArrayList<Tyontekija>();
    }

    public static Scanner scanner = new Scanner(System.in);

    public void addEmployee(Tyontekija e) {
        this.employees.add(e);
        this.numberOfEmployees++;
    }

    public Tyontekija kysyEmpTiedot() {
        System.out.println("Työntekijän nimi: ");
        String name = scanner.nextLine();
        System.out.println("jobTitle: ");
        String jobTitle = scanner.nextLine();
        System.out.println("yearsOfExperience ");
        int yearsOfExperience = scanner.nextInt();
        scanner.nextLine();
        return new Tyontekija(name, jobTitle, yearsOfExperience);

    }

    public Tyontekija lueEmpTiedostosta() throws FileNotFoundException {
        Scanner FScanner = new Scanner(new File("employees.txt"));
        String name = FScanner.nextLine();
        String jobTitle = FScanner.nextLine();
        int yearsOfExperience = FScanner.nextInt();
        return new Tyontekija(name, jobTitle, yearsOfExperience);
    }

    public Esiintyja[] addEsiintyja(Esiintyja d) {
        if (this.numberOfArtists < esiintyjat.length) {
            this.esiintyjat[this.numberOfArtists] = d;
            this.numberOfArtists++;
        } else {
            System.out.println("Festival is full of Artists.");
        }
        return this.esiintyjat;
    }

    public Esiintyja[] removeArtist(int index) {
        // tarkista vielä alkion olemassaolo
        if (this.numberOfArtists > index && index > 0) {
            this.esiintyjat[index] = null;
            this.numberOfArtists--; // Huom!
        } else {
            System.out.println("No removing.");
        }
        return this.esiintyjat;
    }

    public ArrayList<Tyontekija> removeEmployee(Tyontekija o) {
        //Etsi ensin se olio, joka halutaan poistaa
        System.out.println("Anna poistettavan työntekijän nimi: ");
        String ttname = scanner.nextLine();
        if (this.employees.contains(o)) {
            System.out.println("Haluatko todella poistaa työntekijän " + o.getTtname());
            String s = scanner.nextLine();
            if (s.equals("Kylla")) {
                this.employees.remove(o);
                this.numberOfEmployees--;
            } else {
                System.out.println("No removing.");
            }
        } else {
            System.out.println("Kyseistä oliota ei ole.");
        }
        return this.employees;

    }

    @Override
    public String toString() {
        return "Festarit{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                ", esiintyjas=" + Arrays.toString(esiintyjat) +
                ", numberOfEmployees=" + numberOfEmployees +
                ", numberOfDinosaurs=" + numberOfArtists +
                '}';
    }
}

