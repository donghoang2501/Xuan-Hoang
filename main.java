
package diemhp;
public class Main {
    public static void main(String[] args) {
	SinhVien sv[]=new SinhVien[3];
        sv[0]=new SinhVien("Nguyễn Hồng Phong",
                        new HPLyThuyet("Mác-Lê Nin",5,6,7,8),
			new HPThucHanh("Lập trình hướng đối tượng",5,7,8,9) {});
	sv[1]=new SinhVien("Dương Sơn Bá",
			new HPLyThuyet("Nhập môn cơ sở dữ liệu",3,7,8,7),
			new HPThucHanh("Lắp ráp máy tính",3,7,7,5) {});
	sv[2]=new SinhVien("Chúc Anh Đài",
			new HPLyThuyet("Pháp Luật Đại Cương",3,9,5,8),
			new HPThucHanh("Tin học đại cương",2,7,9,9) {});
		
		System.out.println(sv[0]);
		System.out.println(sv[1]);
		System.out.println(sv[2]);
	}

}

