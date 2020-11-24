public class TestMain {

    Section section = new Section();

    Box box1 = new Box("box1");
    Box box2 = new Box("box2");
    Box box3 = new Box("box3");

    Phone phone1= new Phone("phone1",200);
    Phone phone2= new Phone("phone2",300);
    Phone phone3= new Phone("phone3",400);
    Headphones hphones1 = new Headphones("headphones1", 20);
    Charger charger1 = new Charger("charger1", 30);

    box1.addEl(phone1);
    box2.addEl(box3);
    box2.addEl(phone2);
    box2.addEl(phone3);
    box1.addEl(hphones1);
    box1.addEl(charger1);
    section.add(box1);
    section.add(box2);

    phone1.Strategy(new SistOpAndroid());
    phone2.Strategy(new SistOpIOS());
    phone3.Strategy(new SistOpWP());
    section.print();

    BoxStatistics pretTotal = new BoxStatistics();
    section.accept(pretTotal);
    pretTotal.afisare();





}
