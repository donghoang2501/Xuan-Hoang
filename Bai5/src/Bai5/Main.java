package Bai5;
public class Main {
    public static void main (String[] args){
        SinhVien[] sv=new SinhVien[3];
        sv[0]=new SinhVien("Nguyễn Chánh Toàn",
                            new HPLyThuyet("Đường lối",5,10,9,8),
                            new HPThucHanh("Lập trình ",10,9,10,8));
        
        sv[1]=new SinhVien("Nguyễn Quốc Hiếu",
                            new HPLyThuyet("Toán cao cấp",7,8,9,10),
                            new HPThucHanh("Java",10,9,8,7));
        sv[2]=new SinhVien("Đồng Xuân Hoàng",
                            new HPLyThuyet("Kĩ năng mềm",1,2,3,4),
                            new HPThucHanh("Nhập môn mạng máy tính",5,6,7,8));
        
        for(int i=0;i<3;i++)
        System.out.println(sv[i]);
    }
}