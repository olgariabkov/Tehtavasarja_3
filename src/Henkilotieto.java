public class Henkilotieto {
    private String Etunimi;
    private String Sukunimi;
    private int ika;

    //konstruktori

    public Henkilotieto(String etunimi, String sukunimi, int ika) {
        Etunimi = etunimi;
        Sukunimi = sukunimi;
        this.ika = ika;
    }

    //getterit

    public String getEtunimi() {
        return Etunimi;
    }

    public String getSukunimi() {
        return Sukunimi;
    }

    public int getIka() {
        return ika;
    }

    @Override
    public String toString() {
        return "Henkilotieto{" +
                "Etunimi='" + Etunimi + '\'' +
                ", Sukunimi='" + Sukunimi + '\'' +
                ", ika=" + ika +
                '}';
    }
}
