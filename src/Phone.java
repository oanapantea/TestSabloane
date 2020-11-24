
public class Phone implements Element {
    String nume;
    int pret;
    Strategy so;
    public Phone(String n, int p){
        nume=n;
        pret=p;
    }
    public void setStrategy(Strategy st) {
        this.so = st;
    }
    @Override
    public void print() {
        System.out.println(nume + " " + pret);
    }

    public void accept(Visitor visitor){

        visitor.visit(this);
    }
}
