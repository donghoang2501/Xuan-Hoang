
package diemhp;
abstract class HPThucHanh extends DiemHP {
    private double db1, db2, db3;
    
    public HPThucHanh(String tenHP, int soTinChi,double db1,double db2, double db3) {
        super(tenHP, soTinChi);
        this.db1= db1;
        this.db2= db2;
        this.db3= db3;
    }
    
     public double tinhDiem() {
         return ((db1+db2+db3)/3);
     }
}
