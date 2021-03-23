import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		CongTy cty = new CongTy();
		cty.dummyDataCty(); // tạo dữ liệu cho công ty
		cty.dummyDataNhanSu(); // tạo dữ liệu cho nhân sự
		
		//cty.phanBoNhanVienThuong();
		cty.tinhLuong();
		//cty.themNhanSu(scan);
		cty.xuat();
		//cty.xoaNhanSu(scan);
//		System.out.println("******* Danh sách Nhân viên thường có lương cao nhất ********");
//		ArrayList<NhanVienThuong> list = cty.lietKeDSNTVLuongCaoNhat();
//		for(NhanVienThuong nvt: list) {
//			nvt.xuat();
//		}
		//cty.tinhLuong();
		//cty.xuat();
		System.out.println("******* Danh sách Nhân viên đã sắp xếp theo tên ********");
		cty.sortName();
		cty.xuat();

	}

}
