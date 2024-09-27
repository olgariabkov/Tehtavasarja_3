public class Laskuri {
    private int arvo;

    public Laskuri(int arvo) {
        this.arvo = arvo;
    }

    public void muutaArvoa(int modifier) {
        this.arvo = this.arvo + modifier;
    }

    public int getArvo() {
        return arvo;
    }


}
