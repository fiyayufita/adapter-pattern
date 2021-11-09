public class KucingAdapter implements BebekInterface {
    private KucingInterface kucing;

    public KucingAdapter(KucingInterface kucing) {
        this.kucing = kucing;
    }

    public void sound() {
        kucing.sound();
    }
}