package abstraction;

public class Persegi extends Bentuk {
    double sisi;

    Persegi(double sisi) {
        super("Persegi");
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }
}
