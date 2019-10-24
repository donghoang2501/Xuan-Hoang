package kiemtra;

public class Fan extends ElectricalDevice {

    protected String speed;
    protected boolean swing;

    public Fan(String manufacture, int price, String id, String switcher) {
        super(manufacture, price, id, switcher);
    }

    Fan(String lg, int i, String string, boolean b, int i0, boolean b0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSpeed() {
        return speed;
    }

    public boolean getSwing() {
        return swing;
    }

    public void setSwing(boolean swing) {
        this.swing = swing;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void incSpeed() {
        System.out.println("toc do quay cua quat la 1000 vong/phut");
    }

    public void upDate() {

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
