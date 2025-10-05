package abstraction;

public class MainAbstraction {
    public static void main(String[] args) {
        Bentuk b1 = new Persegi(5);
        Bentuk b2 = new Segitiga(4, 6);

        b1.tampil();
        System.out.println("Luas: " + b1.hitungLuas());

        b2.tampil();
        System.out.println("Luas: " + b2.hitungLuas());
    }
}
