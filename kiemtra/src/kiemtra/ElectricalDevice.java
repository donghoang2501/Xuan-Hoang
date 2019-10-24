package kiemtra;

public class ElectricalDevice implements Switchable{

    protected String manufacture;
    protected int price;
    protected String id;
    protected String switcher;

    public ElectricalDevice(String manufacture, int price, String id, String switcher) {
        this.manufacture = manufacture;
        this.price = price;
        this.id = id;
        this.switcher = switcher;
    }

    public String getManuFacture() {
        return manufacture;
    }

    public void setManufacture(String manuFacture) {
        this.manufacture = manuFacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSwitcher() {
        return switcher;
    }

    public void setSwitcher(String switcher) {
        this.switcher = switcher;
    }

    public void upDate() {

    }

    public String toString() {
        return "nha san xuat: " + manufacture
                + "\n" + "gia ban: " + price
                + "\n" + "ma id: " + id
                + "\n" + "cong tac: " + switcher;

    }

    @Override
    public void turnOn() {
        throw new UnsupportedOperationException(); 
    }

    @Override
    public void turnOff() {
        throw new UnsupportedOperationException();
    }
}
