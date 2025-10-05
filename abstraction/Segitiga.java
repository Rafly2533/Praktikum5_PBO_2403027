package abstraction;

public class Segitiga extends Bentuk {
    double alas, tinggi;

    Segitiga(double alas, double tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}
