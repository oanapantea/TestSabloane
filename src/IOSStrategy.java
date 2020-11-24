public class IOSStrategy implements Strategy{
    @Override
    public void render(Phone ph) {
        System.out.print("@IOS: " + ph.nume + " " + ph.pret);
    }
}
