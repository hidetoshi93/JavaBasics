import java.util.Scanner;

/*
 * Muc dich: Quan ly nghiep vu lien quan chuyen xe noi thanh
 * Nguoi tao:
 * Ngay tao:
 * Version
 */
public class ChuyenXeNoiThanh extends ChuyenXe{
//	1. Attributes
	protected String soTuyen;
	protected float soKM;
//	2. Get, set methods

	public String getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}

	public float getSoKM() {
		return soKM;
	}

	public void setSoKM(float soKM) {
		this.soKM = soKM;
	}

	// 3. Constructor methods
	public ChuyenXeNoiThanh() {
		super();
	}
	
	public ChuyenXeNoiThanh(String maSoChuyenXe, String hoTenTaiXe, String soXe, float doanhThu,
								String soTuyen, float soKM) {
		super(maSoChuyenXe, hoTenTaiXe, soXe, doanhThu);
		this.soKM = soKM;
		this.soTuyen = soTuyen;	
	}
	
	// 4. input, output methods
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("So tuyen: ");
		this.soTuyen = scan.nextLine();
		System.out.print("So KM:");
		this.soKM = Float.parseFloat(scan.nextLine());
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("\t So tuyen: " + this.soTuyen + "\t So KM: " + this.soKM);
	}
	// 5. business methods
	

}
