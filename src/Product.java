public class Product implements Element{
    String nume;
    int pret;

    public Product(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public void print() {
        System.out.println(nume);
        System.out.println(pret);

    }
}
