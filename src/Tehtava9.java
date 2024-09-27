public class Tehtava9 {
    public static void main(String[] args) {
        Kassapaate linusJaKisalli = new Kassapaate();

        double vaihtorahaa = linusJaKisalli.syoEdullisesti(10);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);

        vaihtorahaa = linusJaKisalli.syoEdullisesti(5);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);

        vaihtorahaa = linusJaKisalli.syoMaukkaasti(4.3);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);

        System.out.println(linusJaKisalli);
    }
}


