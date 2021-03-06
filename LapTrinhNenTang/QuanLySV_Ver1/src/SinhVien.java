import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {

//	1. Attribute

	private String tenSV;
	private int maSV;
	private String xepLoai;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;

//	2. get,set methods

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String _tenSV) {
		this.tenSV = _tenSV;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int _maSV) {
		this.maSV = _maSV;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float _diemToan) {
		this.diemToan = _diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float _diemLy) {
		this.diemLy = _diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float _diemHoa) {
		this.diemHoa = _diemHoa;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	public float getDiemTB() {
		return diemTB;
	}

//	3. constructor methods

	public SinhVien() {

	}

	public SinhVien(String _tenSV, int _maSV, float _diemToan, float _diemLy, float _diemHoa) {
		this.tenSV = _tenSV;
		this.maSV = _maSV;
		this.diemToan = _diemToan;
		this.diemLy = _diemLy;
		this.diemHoa = _diemHoa;
	}

//	4. input, output methods

	public void nhap(Scanner scan) {
		System.out.print("Nhap ten sinh vien: ");
		this.tenSV = scan.nextLine();
		System.out.print("Nhap ma sinh vien: ");
		this.maSV = Integer.parseInt(scan.nextLine());
		System.out.print("Nhap diem toan: ");
		this.diemToan = Float.parseFloat(scan.nextLine());
		System.out.print("Nhap diem ly: ");
		this.diemLy = Float.parseFloat(scan.nextLine());
		System.out.print("Nhap diem hoa: ");
		this.diemHoa = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println("Ma sinh vien:" + this.maSV + "\t Ten sinh vien:" + this.tenSV + "\t Toan:" + this.diemToan
				+ "\t Ly:" + this.diemLy + "\t Hoa:" + this.diemHoa + "\t TB:" + this.diemTB + "\t Xep loai:"
				+ this.xepLoai);
	}

//	5. business methods
	public void tinhDiemTB() {
		this.diemTB = (this.diemToan + this.diemHoa + this.diemLy) / 3;
	}

	public void xepLoai() {
		if (this.diemTB >= 9) {
			this.xepLoai = "Xuat Sac";
		} else if (this.diemTB >= 8) {
			this.xepLoai = "Gioi";
		} else if (this.diemTB >= 7) {
			this.xepLoai = "Kha";
		} else if (this.diemTB >= 6) {
			this.xepLoai = "Trung Binh";
		} else {
			this.xepLoai = "Yeu";
		}
	}

	private String formatNumCell(Number num) {
		String paddLeft = "%5s";
		String paddRight = "%-8s";
		return String.format(paddLeft, " ") + String.format(paddRight, num) + "|";
	}

	private String formatTextCell(String text) {
		String paddLeft = "%-15s";
		return String.format(paddLeft, " " + text);
	}

	public void xuatRowFormat() {
		
		String text;
		text = formatNumCell(this.maSV);
		
		text += formatTextCell(this.tenSV) + "|";
		
		text += formatNumCell(this.diemToan);
		
		text += formatNumCell(this.diemLy);
		
		text += formatNumCell(this.diemHoa);
		
		double dtb = Math.round(this.diemTB * 100.0)/100.0;
		text += formatNumCell(dtb);
		text += formatTextCell(this.xepLoai) + "||";
		System.out.println(text);
	}
}
