public class Elokuva {
    private String nimi;
    private String ohjaaja;
    private int julkaisuvuosi;
    private int ikaraja;
    private String genre;

    public Elokuva(String nimi, String ohjaaja, int julkaisuvuosi, int ikaraja, String genre) {
        this.nimi = nimi;
        this.ohjaaja = ohjaaja;
        this.julkaisuvuosi = julkaisuvuosi;
        this.ikaraja = ikaraja;
        this.genre = genre;
    }

    //getterit

    public String getNimi() {
        return nimi;
    }

    public String getOhjaaja() {
        return ohjaaja;
    }

    public int getJulkaisuvuosi() {
        return julkaisuvuosi;
    }

    public int getIkaraja() {
        return ikaraja;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Elokuva{" +
                "nimi='" + nimi + '\'' +
                ", ohjaaja='" + ohjaaja + '\'' +
                ", julkaisuvuosi=" + julkaisuvuosi +
                ", ikaraja=" + ikaraja +
                ", genre='" + genre + '\'' +
                '}';
    }
}
