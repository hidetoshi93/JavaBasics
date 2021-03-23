import java.util.Scanner;

/*
 * Mục đích: Quản lý nghiệp vụ liên quan Giám đốc
 * */
public class GiamDoc extends NhanSu {
	//Constants
	final int LUONG_NGAY = 300;
	//1. Attributes
	private float coPhan; 
	//2. Get, set
	
	/**
	 * @return the coPhan
	 */
	public float getCoPhan() {
		return coPhan;
	}

	/**
	 * @param coPhan the coPhan to set
	 */
	public void setCoPhan(float coPhan) {
		this.coPhan = coPhan;
	}
	//3. Constructor
	public GiamDoc() {
		
	}

	public GiamDoc(String maso, String hoTen, String soDienThoai, float soNgayLamViec, float coPhan) {
		super(maso, hoTen, soDienThoai, soNgayLamViec);
		this.coPhan = coPhan;
		
	}
	
	//4. Input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhập số cổ phần: ");
		this.coPhan = Float.parseFloat(scan.nextLine());
		
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Lương: " + this.luong);
	}
	
	//5. Business
	public void tinhLuong() {
		this.luong = this.soNgayLamViec * LUONG_NGAY;
	}

}
