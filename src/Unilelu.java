public class Unilelu {
    private String nimi;
    private String lelunTyyppi;
    private int ika;

    //1 konstruktori: kaikki parametrit

    public Unilelu(String nimi, String lelunTyyppi, int ika) {
        this.nimi = nimi;
        this.lelunTyyppi = lelunTyyppi;
        this.ika = ika;
    }

    public Unilelu(String nimi) {
        this.nimi = nimi;
    }



    //2 konstruktori: vain nimi, muut oletusarvot

    /*public Unilelu(String nimi) {
        this.nimi = nimi;
        this.lelunTyyppi = "Tuntematon"; //oletusarvo
        this.ika = 0; //oletusarvo
    }

    // 3 konstruktori, vain leluntyyppi
    public Unilelu(String lelunTyyppi) {
        this.nimi = "Tuntematon";
        this.lelunTyyppi = lelunTyyppi;
        this.ika = 0;
    }

    // toString metodi

    @Override
    public String toString() {
        return "Unilelu{" +
                "nimi='" + nimi + '\'' +
                ", lelunTyyppi='" + lelunTyyppi + '\'' +
                ", ika=" + ika +
                '}'; */
    }
