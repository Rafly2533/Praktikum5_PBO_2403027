package interfaceF;

public class MainInterface {
    public static void main(String[] args) {
        Kendaraan mbl = new Mobil();
        Kendaraan mtr = new Motor();

        mbl.berjalan();
        mbl.berhenti();

        mtr.berjalan();
        mtr.berhenti();
    }
}
