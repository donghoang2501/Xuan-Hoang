package Bai5;
public class SinhVien {
    private String hoTen;
    private DiemHP hp1,hp2;
    
    public SinhVien(String hoTen,DiemHP hp1,DiemHP hp2){
        this.hoTen= hoTen;
        this.hp1= hp1;
        this.hp2= hp2;
    }
    public double tinhDTB(){
        return (hp1.tinhDiem()*hp1.laySoTinChi()+hp2.tinhDiem()*hp2.laySoTinChi())
                /(hp1.laySoTinChi()+hp2.laySoTinChi());
    }
    
    public String toString(){
        return "\nTen: "+hoTen+
               "\nDiem HP1: "+hp1.tinhDiem()+
               "\nDiem HP2: "+hp2.tinhDiem()+
               "\nDiem TB: "+tinhDTB();
                
    }
}