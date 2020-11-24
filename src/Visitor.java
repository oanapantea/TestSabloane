public interface Visitor {

    void visit(Phone phone);
    void visit(Headphones headphones);
    void visit(Charger charger);
    void visit(Box box);
}
