package polymorphism;

public class OverloadingDemo {
    // Method dengan nama sama tapi parameter berbeda
    void luas(int sisi) {
        System.out.println("Luas persegi: " + (sisi * sisi));
    }

    void luas(int panjang, int lebar) {
        System.out.println("Luas persegi panjang: " + (panjang * lebar));
    }

    public static void main(String[] args) {
        OverloadingDemo hitung = new OverloadingDemo();
        hitung.luas(5);
        hitung.luas(4, 6);
    }
}
