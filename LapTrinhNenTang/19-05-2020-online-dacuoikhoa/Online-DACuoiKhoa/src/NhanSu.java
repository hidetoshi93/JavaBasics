import java.util.Scanner;

/*
 * Mục đích: Để quản lý các nghiệp vụ lớp cha về Nhân sự 
 * */
public class NhanSu {
	// 1. Attributes
	protected String maso;
	protected String hoTen;
	protected String soDienThoai;
	protected float soNgayLamViec;
	protected float luong;
	// 2. Get, set
	
	/**
	 * @return the maso
	 */
	public String getMaso() {
		return maso;
	}

	/**
	 * @param maso the maso to set
	 */
	public void setMaso(String maso) {
		this.maso = maso;
	}

	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}

	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	/**
	 * @return the soDienThoai
	 */
	public String getSoDienThoai() {
		return soDienThoai;
	}

	/**
	 * @param soDienThoai the soDienThoai to set
	 */
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	/**
	 * @return the soNgayLamViec
	 */
	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	/**
	 * @param soNgayLamViec the soNgayLamViec to set
	 */
	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}
	
	public float getLuong() {
		return this.luong;
	}

	// 3. Constructors
	public NhanSu() {
		
	}

	/**
	 * @param maso
	 * @param hoTen
	 * @param soDienThoai
	 * @param soNgayLamViec
	 */
	public NhanSu(String maso, String hoTen, String soDienThoai, float soNgayLamViec) {
		this.maso = maso;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
	}
	
	// 4. Input, output
	public void nhap(Scanner scan) {
		System.out.println("========== Thêm Nhân Sự ========== ");
		System.out.print("Nhập mã số");
		this.maso = scan.nextLine();
		
		System.out.print("Nhập họ tên");
		this.hoTen = scan.nextLine();
		
		System.out.print("Nhập số điện thoại");
		this.soDienThoai = scan.nextLine();
		
		System.out.print("Nhập số ngày làm việc");
		this.soNgayLamViec = Float.parseFloat(scan.nextLine());
		
		System.out.println("========== Kết thúc ========== ");
	}
	
	public void xuat() {
		System.out.print(" Mã số: " + this.maso);
		System.out.print("\t Họ tên: " + this.hoTen);
		System.out.print("\t SĐT: " + this.soDienThoai);
		System.out.print("\t Số ngày làm: " + this.soNgayLamViec);
	}
	
	public void xuatMaVaTen() {
		System.out.println("Mã: " + this.maso + "\t Tên:" + this.hoTen);
	}
	// 5. Business methods
	
	public void tinhLuong() {
		this.luong = 0;
	}
	

}
