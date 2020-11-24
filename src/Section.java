import java.util.ArrayList;

public class Section implements Visitee{
    ArrayList<Element> elementArrayList=new ArrayList<>();

    public void add(Element el){
        elementArrayList.add(el);
    }
    public void print() {
        for(Element el: elementArrayList){
            el.print();
        }
    }
    public void accept(Visitor v) {
        for(Element elem:elementArrayList)
            elem.accept(v);
    }
}