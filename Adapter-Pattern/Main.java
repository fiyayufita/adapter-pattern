public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        BebekInterface bebek = new Bebek();

        BebekInterface kucingAdapter = new KucingAdapter(kucing);

        System.out.println("Suara Kucing");
        kucing.sound();

        System.out.println("Suara Bebek");
        bebek.sound();

        System.out.println("Bebek bersuara Kucing");
        kucingAdapter.sound();
    }
}