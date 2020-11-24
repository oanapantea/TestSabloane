public class WindowsStrategy implements Strategy {
    public void render(Phone ph) {
        System.out.print("@WP: " + ph.nume + " " + ph.pret);
    }
}
