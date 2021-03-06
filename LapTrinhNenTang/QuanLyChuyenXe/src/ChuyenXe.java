import java.util.Scanner;

/*
 * Muc dich
 * Ngay tao: 
 * Nguoi tao:
 * Version:
 */
public class ChuyenXe {
//	1. Attributes
	protected String maSoChuyenXe;
	protected String hoTenTaiXe;
	protected String soXe;
	protected float doanhThu;

//	2. Get, set methods
	public String getMaSoChuyenXe() {
		return maSoChuyenXe;
	}

	public void setMaSoChuyenXe(String maSoChuyenXe) {
		this.maSoChuyenXe = maSoChuyenXe;
	}

	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}

	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public Float getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(Float doanhThu) {
		this.doanhThu = doanhThu;
	}

//	3. Constructor methods
	public ChuyenXe() {
		this.doanhThu = 0;
		this.soXe = "";
	}

	public ChuyenXe(String maSoChuyenXe, String hoTenTaiXe, String soXe, float doanhThu) {
		this.maSoChuyenXe = maSoChuyenXe;
		this.hoTenTaiXe = hoTenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}

//	4. Input, output methods
	public void nhap(Scanner scan) {
		System.out.print("Nhap ma so chuyen:");
		this.maSoChuyenXe = scan.nextLine();
		System.out.print("Nhap ho ten tai xe:");
		this.hoTenTaiXe = scan.nextLine();
		System.out.print("Nhap so xe:");
		this.soXe = scan.nextLine();
		System.out.print("Nhap doanh thu:");
		this.doanhThu = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.print("Ma so chuyen: " + this.maSoChuyenXe + "\t Ho ten tai xe: " + this.hoTenTaiXe + "\t So xe: "
				+ this.soXe + "\t Doanh thu: " + this.doanhThu);
	}

//	5. Business methods

}
