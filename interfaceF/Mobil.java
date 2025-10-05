package interfaceF;

public class Mobil implements Kendaraan {
    @Override
    public void berjalan() {
        System.out.println("Mobil berjalan di jalan raya.");
    }

    @Override
    public void berhenti() {
        System.out.println("Mobil berhenti di lampu merah.");
    }
}
