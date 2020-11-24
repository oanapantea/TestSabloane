public class Charger extends Product implements Element {

    public Charger(String nume, int pret) {
        super(nume, pret);
    }

    @Override
    public void print() {
        System.out.println(nume + " " + pret + ":This is a charger");
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
