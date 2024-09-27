public class Tehtava7 {
    public static void main(String[] args) {
        Henkilo lorraine = new Henkilo();
        Aikakone tardis = new Aikakone(lorraine);
        tardis.siirryAjassa(6);
        System.out.println(lorraine.getVuosi());
    }


}
