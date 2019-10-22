package Bai5;
public class Main {
    public static void main (String[] args){
        SinhVien[] sv=new SinhVien[3];
        sv[0]=new SinhVien("Nguyễn Thị Tươi",
                            new HPLyThuyet("Tư tưởng HCM",4,10,9,8),
                            new HPThucHanh("Lập trình cơ bản",3,9,7,8));
        
        sv[1]=new SinhVien("Nguyễn Quốc Hiếu",
                            new HPLyThuyet("Pháp luật đại cương",3,9,9,8),
                            new HPThucHanh("Lập trình HĐT",4,8,7,8));
        sv[2]=new SinhVien("Trần Danh Trung",
                            new HPLyThuyet("Kĩ năng mềm",2,7,7,7),
                            new HPThucHanh("Nhập môn mạng máy tính",3,8,9,9));
        
        for(int i=0;i<3;i++)
        System.out.println(sv[i]);
    }
}