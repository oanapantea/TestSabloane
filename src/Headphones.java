public class Headphones extends Product implements Element{

    public Headphones(String nume, int pret) {
        super(nume, pret);
    }

    @Override
    public void print() {
        System.out.println(nume + " " + pret + ":This is a headphone.");
    }

    public void accept(Visitor visitor){

        visitor.visit(this);
    }
}
