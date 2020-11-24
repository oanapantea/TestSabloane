public class AndroidStrategy implements Strategy {
    public void render(Phone ph) {
        System.out.print("@Android: " + ph.nume + " " + ph.pret);
    }
}
