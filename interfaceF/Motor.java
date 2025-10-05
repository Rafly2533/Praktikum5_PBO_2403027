package interfaceF;

public class Motor implements Kendaraan {
    @Override
    public void berjalan() {
        System.out.println("Motor melaju di jalan kecil.");
    }

    @Override
    public void berhenti() {
        System.out.println("Motor berhenti di pinggir jalan.");
    }
}
