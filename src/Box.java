
import java.util.ArrayList;

public class Box implements Element {
    String nume;
    ArrayList<Element> elementArrayList = new ArrayList<>();

    public Box(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int addEl(Element element) {
        elementArrayList.add(element);
        return elementArrayList.indexOf(element);
    }

    @Override
    public void print() {
        System.out.println(nume);

        for (Element el : elementArrayList) {
            el.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for(Element elem: elementArrayList) {
            elem.accept(visitor);
        }

    }
}
