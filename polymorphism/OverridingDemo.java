package polymorphism;

class Hewan {
    void suara() {
        System.out.println("Hewan mengeluarkan suara...");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Kucing: Meong!");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Anjing: Guk guk!");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();

        h1.suara();
        h2.suara();
    }
}
