import java.util.Scanner;

/*
 * 目的：　GiaoDichクラスを継承し、金の取引を管理する
 * 作成人：
 * 作成日：
 * バージョン：
 */
public class GiaoDichVang extends GiaoDich {
	//	1. Attributes
	private String loaiVang;

	//	2. Get,set methods

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}

	// 3. Constructor methods
	public GiaoDichVang() {

	}

	public GiaoDichVang(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngay, thang, nam, donGia, soLuong);
		this.loaiVang = loaiVang;
	}
	
	//	4. Input,output methods
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhap loai vang: ");
		this.loaiVang = scan.nextLine();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Loai vang: " + this.loaiVang + "\t Thanh tien: " + this.thanhTien);
	}
	
	//	5. Business methods
	@Override
	public void tinhTien() {
		this.thanhTien = this.donGia * this.soLuong;
	}
}
