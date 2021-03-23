import java.util.Scanner;

/*
 * Muc dich: 
 * Nguoi tao:
 * Ngay tao:
 * Version:
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe {
//	1. Attributes
	private String noiDen;
	private float soNgayDiDuoc;

//	2. Set,get methods

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public float getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(float soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	// 3. Constructor methods
	public ChuyenXeNgoaiThanh() {

	}

	public ChuyenXeNgoaiThanh(String maSoChuyenXe, String hoTenTaiXe, String soXe, float doanhThu, String noiDen,
			float soNgayDiDuoc) {
		super(maSoChuyenXe, hoTenTaiXe, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

//	4. Input, output methods
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhap noi den: ");
		this.noiDen = scan.nextLine();
		System.out.print("So ngay di duoc: ");
		this.soNgayDiDuoc = Float.parseFloat(scan.nextLine());
	}

	@Override
	public void xuat(){
		super.xuat();
		System.out.println("\t Noi den: " + this.noiDen + "\t So ngay di duoc: " + this.soNgayDiDuoc);
	}
	
//	5. Business methods

}
