import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Khoi tao doi tuong
		HinhChuNhat hcn = new HinhChuNhat();
		
		hcn.nhap(scan);
		hcn.tinhChuVi();
		hcn.tinhDienTich();
		hcn.xuat();
	}
}
