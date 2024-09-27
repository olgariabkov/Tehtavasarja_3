public class Aikakone {
    private Henkilo matkustaja;

    public Aikakone(Henkilo henkilo) {
        this.matkustaja = henkilo;
    }

    public void siirryAjassa(int vuosia) {
        this.matkustaja.setVuosi(this.matkustaja.getVuosi() + vuosia);
    }

}

