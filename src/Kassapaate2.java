public class Kassapaate2 {
        private double rahaa;
        private int edulliset;
        private int maukkaat;

        private final double edullinen = 2.50;
        private final double maukas = 4.30;

        // konstruktori
        public Kassapaate2(double rahaa, int edulliset, int maukkaat) {
            this.rahaa = rahaa;
            this.edulliset = edulliset;
            this.maukkaat = maukkaat;
        }

        public Kassapaate2() {
            this.rahaa = 100;
            this.edulliset = 0;
            this.maukkaat = 0;
        }

        // metodi edullisen lounaan ostamiseen käteisellä
        public double syoEdullisesti(double maksu) {
            if (maksu >= edullinen) {
                this.rahaa += edullinen;
                this.edulliset++;
                return maksu - edullinen; // palautetaan vaihtoraha
            } else {
                System.out.println("Ei tarpeeksi rahaa");
                return maksu; // palautetaan maksu, jos ei ole tarpeeksi rahaa
            }
        }

        // metodi maukkaan lounaan ostamiseen käteisellä
        public double syoMaukkaasti(double maksu) {
            if (maksu >= maukas) {
                this.rahaa += maukas;
                this.maukkaat++;
                return maksu - maukas; // palautetaan vaihtoraha
            } else {
                System.out.println("Ei tarpeeksi rahaa");
                return maksu; // palautetaan maksu, jos ei ole tarpeeksi rahaa
            }
        }

        // metodi edullisen lounaan ostamiseen kortilla
        public boolean syoEdullisesti(Maksukortti kortti) {
            if (kortti.otaRahaa(edullinen)) {
                this.edulliset++;
                return true;
            } else {
                System.out.println("Ei tarpeeksi rahaa");
                return false;
            }
        }
        // metodi maukkaan lounaan ostamiseen kortilla
        public boolean syoMaukkaasti(Maksukortti kortti) {
            if (kortti.otaRahaa(maukas)) {
                this.maukkaat++;
                return true;
            } else {
                System.out.println("Ei tarpeeksi rahaa");
                return false;
            }
        }

        // metodi rahan lataamiseen kortille
        public void lataaRahaa(Maksukortti kortti, double rahamaara) {
            if (rahamaara > 0) {
                kortti.lataaRahaa(rahamaara);
                this.rahaa += rahamaara;
            } else {
                System.out.println("Ladattava summa tulee olla positiivinen");
            }
        }

        // kassan tiedot

        @Override
        public String toString() {
            return "Kassapaate{" +
                    "rahaa=" + rahaa +
                    ", edulliset=" + edulliset +
                    ", maukkaat=" + maukkaat +
                    '}';
        }
    }


