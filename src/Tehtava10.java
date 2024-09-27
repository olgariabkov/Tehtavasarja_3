public class Tehtava10 {
    public static void main(String[] args) {
    Kassapaate2 linusJaKisalli = new Kassapaate2();
        System.out.println(linusJaKisalli);

        double vaihtorahaa = linusJaKisalli.syoEdullisesti(10);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);

    Maksukortti annukanKortti = new Maksukortti("Annu", 7);

        System.out.println("kortilla rahaa " + annukanKortti.saldo() + " euroa");

    boolean onnistuiko = linusJaKisalli.syoMaukkaasti(annukanKortti);
    System.out.println("riittikö raha: " + onnistuiko);

        linusJaKisalli.lataaRahaa(annukanKortti, 100);

    onnistuiko = linusJaKisalli.syoMaukkaasti(annukanKortti);
        System.out.println("riittikö raha: " + onnistuiko);

        onnistuiko = linusJaKisalli.syoEdullisesti(annukanKortti);
        System.out.println("riittikö raha: " + onnistuiko);

        linusJaKisalli.lataaRahaa(annukanKortti, 50);
        System.out.println("kortillle ladattu 50 euroa");

        System.out.println(linusJaKisalli);
}
}


