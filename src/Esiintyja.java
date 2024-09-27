public class Esiintyja {
    private String name;
    private int age;
    private String genre;
    private String aloituaika;
    private String lopetusaika;

    public Esiintyja(String name, int age, String genre, String aloituaika, String lopetusaika) {
        this.name = name;
        this.age = age;
        this.genre = genre;
        this.aloituaika = aloituaika;
        this.lopetusaika = lopetusaika;
    }

    //getteri
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Esiintyja{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", genre='" + genre + '\'' +
                ", aloituaika='" + aloituaika + '\'' +
                ", lopetusaika='" + lopetusaika + '\'' +
                '}';
    }
}

