import java.util.Scanner;

/*
 * 目的：superclass 作成
 * 作成人：
 * 作成日：
 * バージョン：
 * 
 */
public class GiaoDich {
//	1. Attributes
	protected int maGiaoDich;
	protected int ngay;
	protected int thang;
	protected int nam;
	protected float donGia;
	protected int soLuong;
	protected float thanhTien;

//	2. Get,set methods
	public int getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(int maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public float getThanhTien() {
		return thanhTien;
	}

	//	3. Constructor methods
	public GiaoDich() {
		
	}

	public GiaoDich(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong) {
		this.maGiaoDich = maGiaoDich;
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	
	//	4. Input,output methods
	public void nhap(Scanner scan) {
		System.out.print("Nhap ma: ");
		this.maGiaoDich = Integer.parseInt(scan.nextLine());
		
		System.out.print("Nhap ngay: ");
		this.ngay = Integer.parseInt(scan.nextLine());
		
		System.out.print("Nhap thang: ");
		this.thang = Integer.parseInt(scan.nextLine());
		
		System.out.print("Nhap nam: ");
		this.nam = Integer.parseInt(scan.nextLine());
		
		System.out.print("Nhap don gia: ");
		this.donGia = Float.parseFloat(scan.nextLine());
		
		System.out.print("Nhap so luong: ");
		this.soLuong = Integer.parseInt(scan.nextLine());
	}
	
	public void xuat() {
		System.out.print("Ma: " + this.maGiaoDich +
						"\t Ngay/Thang/Nam: " + this.ngay + "/" + this.thang + "/" + this.nam +
						"\t Don gia: " + this.donGia +
						"\t So luong: " + this.soLuong);
	}
	//	5. Business methods
	public void tinhTien() {
		this.thanhTien = 0;
	}

}
