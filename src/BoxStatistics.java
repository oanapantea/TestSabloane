public class BoxStatistics implements Visitor{
    int phoneS = 0;
    int headphoneS = 0;
    int chargerS = 0;

    @Override
    public void visit(Phone phone) {
        phoneS += phone.pret;
    }

    @Override
    public void visit(Headphones headphones) {
        headphoneS += headphones.pret;
    }

    @Override
    public void visit(Charger charger) {
        chargerS += charger.pret;
    }

    public void afisare(){
        System.out.println("Pret total telefoane: "+phoneS);
        System.out.println("Pret total incarcatoare: "+chargerS);
        System.out.println("Pret total casti: "+headphoneS);
    }
}
