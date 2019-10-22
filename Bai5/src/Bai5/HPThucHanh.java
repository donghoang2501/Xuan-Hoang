package Bai5;
public class HPThucHanh extends DiemHP {
    private double db1;
    private double db2;
    private double db3;
    
    public HPThucHanh(String hoTen, int soTinChi, double db1, double db2, double db3){
        super(hoTen,soTinChi);
        this.db1= db1;
        this.db2= db2;
        this.db3= db3;
    }
    
    public double tinhDiem(){
        return (db1+db2+db3)/3;
    }
}