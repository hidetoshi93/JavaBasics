import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DanhSachChuyenXe dsChuyenXe = new DanhSachChuyenXe();
		dsChuyenXe.dummyData();
		dsChuyenXe.xuat();
		float doanhThuND = dsChuyenXe.tinhDoanhThuChuyenXeNamDinh();
		System.out.println("Doanh thu Nam Dinh: " + doanhThuND);
		
//		dsChuyenXe.tinhTongDoanhThu();
//		System.out.println("Tong doanh thu: " + dsChuyenXe.getTongDoanhThu());
//		
//		dsChuyenXe.tinhDoanhThuNoi();
//		System.out.println("Doanh thu noi: " + dsChuyenXe.getDoanhThuNoi());
//		
//		dsChuyenXe.tinhDoanhThuNgoai();
//		System.out.println("Doanh thu ngoai: " + dsChuyenXe.getDoanhThuNgoai());
	}
}

