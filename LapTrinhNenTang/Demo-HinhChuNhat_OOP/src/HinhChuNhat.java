import java.util.Scanner;

/*
 * 目的：　
 * 作成人： 
 * 作成日：　2021年3月17日
 * バージョン： 1.0
 */
public class HinhChuNhat {
	// 1. Cac thuoc tinh
	private float chieuDai;
	private float chieuRong;
	private float chuVi;
	private float dienTich;

	// 2. Cac phuong thuc get,set
	public float getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}

	public float getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}

	public float getChuVi() {
		return chuVi;
	}

	public float getDienTich() {
		return dienTich;
	}

	// 3. Cac phuong thuc khoi tao
	public HinhChuNhat() {

	}

	public HinhChuNhat(float cDai, float cRong) {
		this.chieuDai = cDai;
		this.chieuRong = cRong;
	}

	// 4. Cac phuong thuc nhap, xuat
	public void nhap(Scanner scan) {
		System.out.println("Nhap chieu dai: ");
		this.chieuDai = Float.parseFloat(scan.nextLine());

		System.out.println("Nhap chieu rong: ");
		this.chieuRong = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println(
				"Hinh chu nhat (" + chieuDai + ", " + chieuRong + "). Dien tich: " + dienTich + "\t Chu vi:" + chuVi);
	}

	// 5. Cac phuong thuc xu ly nghiep vu lien quan
	public void tinhChuVi() {
		this.chuVi = (chieuDai + chieuRong) * 2;
	}

	public void tinhDienTich() {
		this.dienTich = chieuDai * chieuRong;
	}

}
