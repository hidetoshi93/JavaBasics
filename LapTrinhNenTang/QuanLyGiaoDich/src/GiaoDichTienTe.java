import java.util.Scanner;

/*
 *  目的：　GiaoDichクラスを継承し、通貨の取引を管理する
 * 作成人：
 * 作成日：
 * バージョン：
 */

public class GiaoDichTienTe extends GiaoDich {
	//	1. Attributes
	private float tiGia;
	private int loaiTien;
	
	//	2. Get,set methods
	public float getTiGia() {
		return tiGia;
	}

	public void setTiGia(float tiGia) {
		this.tiGia = tiGia;
	}

	public int getLoaiTien() {
		return loaiTien;
	}

	public void setLoaiTien(int loaiTien) {
		this.loaiTien = loaiTien;
	}
	
	//	3. Constructor methods
	public GiaoDichTienTe() {
		
	}

	public GiaoDichTienTe(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong, float tiGia, int loaiTien) {
		super(maGiaoDich, ngay, thang, nam, donGia, soLuong);
		this.tiGia = tiGia;
		this.loaiTien = loaiTien;
	}
	
	//	4. Input,output methods
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhap loai tien (1. VND, 2. USD, 3. EURO): ");
		this.loaiTien = Integer.parseInt(scan.nextLine());
		
		System.out.print("Nhap ti gia: ");
		this.tiGia = Float.parseFloat(scan.nextLine());
	}
	
	@Override
	public void xuat() {
		String temp = "";
		if(this.loaiTien == 1) {
			temp = " VND";
		}else if (this.loaiTien == 2) {
			temp = " USD";
		} else {
			temp = " EURO";
		}
		super.xuat();
		System.out.println("\t Loai tien te: " + temp +
						   "\t Ti gia: " + this.tiGia +
						   "\t Thanh tien: " + this.thanhTien);
	}
	
	//	5. Business methods
	@Override
	public void tinhTien() {
		if(this.loaiTien == 1) {
			this.thanhTien = this.soLuong * this.donGia;
		}else if (this.loaiTien == 2 || this.loaiTien ==3) {
			this.thanhTien = this.soLuong * this.tiGia;
		} 
	}
}
