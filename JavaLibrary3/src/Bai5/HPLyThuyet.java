package Bai5;
public class HPLyThuyet extends DiemHP {
    private int chuyenCan;
    private int giuaKy;
    private int cuoiKy;
    
    public HPLyThuyet(String hoTen, int soTinChi, int cc, int gk, int ck){
        super(hoTen,soTinChi);
        this.chuyenCan= cc;
        this.giuaKy= gk;
        this.cuoiKy= ck;
    }
    
    public double tinhDiem(){
        return (chuyenCan*0.1+giuaKy*0.2+cuoiKy*0.7);
    }
}
