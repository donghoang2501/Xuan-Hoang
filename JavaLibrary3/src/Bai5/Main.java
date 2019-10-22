package Bai5;
public class Main {
    public static void main (String[] args){
        SinhVien[] sv=new SinhVien[3];
        sv[0]=new SinhVien("Trần Văn A",
                            new HPLyThuyet("Đường lối HCM",5,6,7,8),
                            new HPThucHanh("Lập trình ",1,2,3,4));
        
        sv[1]=new SinhVien("Đỗ Chánh Toàn",
                            new HPLyThuyet("Pháp luật đại cương",3,4,5,6),
                            new HPThucHanh("Lập trình cơ bản",4,5,6,8));
        sv[2]=new SinhVien("Trần Mạnh An",
                            new HPLyThuyet("Kĩ năng mềm",7,7,7,7),
                            new HPThucHanh("Nhập mạng máy tính",3,7,9,9));
        
        for(int i=0;i<3;i++)
        System.out.println(sv[i]);
    }
}
