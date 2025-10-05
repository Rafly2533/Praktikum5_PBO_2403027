package abstraction;

public abstract class Bentuk {
    String nama;

    Bentuk(String nama) {
        this.nama = nama;
    }

    abstract double hitungLuas();

    void tampil() {
        System.out.println("Ini adalah bentuk: " + nama);
    }
}
