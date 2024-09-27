public class Maksukortti {
    private String omistaja;
    private double saldo;
    private final double edullinenLounas = 2.95;
    private final double maukasLounas = 6.90;

    //konstruktori, jolla luodaan kortti

    public Maksukortti(String omistaja, double saldo) {
        this.omistaja = omistaja;
        this.saldo = saldo;
    }

    //tostring metodi kortin tietojen tulostamiseen

    @Override
    public String toString() {
        return "Kortin omistaja: " + this.omistaja + ", kortilla on saldoa: " + this.saldo + " euroa.";
    }

    //metodi edullisen lounaan ostamiseen
    public void syoEdullisesti() {
        if (this.saldo >= edullinenLounas) {
            this.saldo -= edullinenLounas;
        } else {
            System.out.println("Edullista lounasta ei voi myydä, kortilla ei ole riittävästi saldoa");
        }
    }

    //metodi maukkaan lounaan ostamiseen
    public void syoMaukkaasti() {
        if (this.saldo >= maukasLounas) {
            this.saldo -= maukasLounas;
        } else {
            System.out.println("Maukasta lounasta ei voi myydä, kortilla ei ole riittävästi saldoa");
        }
    }

    //metodi saldon tarkistamiseen
    public double saldo() {
        return this.saldo;
    }

    //metodi rahan lataamiseen
    public void lataaRahaa(double rahamaara) {
        if (rahamaara > 0) {
            this.saldo += rahamaara;
        }
    }

    //metodi rahan ottamiseen
    public boolean otaRahaa(double rahamaara) {
        if (rahamaara <= this.saldo) {
            this.saldo -= rahamaara;
            return true;
        } else {
            return false;
        }
    }
}
