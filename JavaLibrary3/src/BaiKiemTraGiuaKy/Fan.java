package BaiKiemTraGiuaKy;
public class Fan extends ElectricalDevice {

    protected int speed;
    protected boolean swing;
     public Fan(String manufacture, int price, String id, String switcher) {
        super(manufacture, price, id, switcher);
    }
    Fan(String lg, int i, String string, boolean b, int i0, boolean b0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isSwing() {
        return swing;
    }
    public void setSwing(boolean swing) {
        this.swing = swing;
    }
    public void incSpeed(int speed) {
        System.out.println("Fan is running " + speed);
    }
    public void accelarate() {
        speed += 3;
    }
    public void upDate(){        
    }
}
