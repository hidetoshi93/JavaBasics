import java.util.ArrayList;
import java.util.Scanner;

/*
 * Mục đích: Quản lý danh sách nhân sự và xử lý nghiệp vụ liên quan
 * 
 * */
public class DanhSachNhanSu {
	// 1. Attributes
	private ArrayList<NhanSu> listNhanSu;
	// 2. get, set

	/**
	 * @return the listNhanSu
	 */
	public ArrayList<NhanSu> getListNhanSu() {
		return listNhanSu;
	}

	/**
	 * @param listNhanSu the listNhanSu to set
	 */
	public void setListNhanSu(ArrayList<NhanSu> listNhanSu) {
		this.listNhanSu = listNhanSu;
	}

	// 3. Constructors
	public DanhSachNhanSu() {
		this.listNhanSu = new ArrayList<NhanSu>();
	}

	// 4. Input, output
	private void inMenu() {
		System.out.println("1. Nhập Nhân viên thường");
		System.out.println("2. Nhập Trưởng phòng");
		System.out.println("3. Nhập Giám đốc");
		System.out.println("0. Thoát ");
	}

	public ArrayList<NhanVienThuong> nhap(Scanner scan) {
		boolean flag = true;
		ArrayList<NhanVienThuong> listNVThuongMoi = new ArrayList<NhanVienThuong>();
		NhanSu nhanSu = null;
		do {
			inMenu();
			System.out.print("Mời chọn >>");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 0:
				flag = false;
				break;
			case 1:
				nhanSu = new NhanVienThuong();
				nhanSu.nhap(scan);
				nhanSu.tinhLuong();
				// thêm vào danh sách
				this.them(nhanSu);
				listNVThuongMoi.add((NhanVienThuong)nhanSu);
				break;
			case 2:
				nhanSu = new TruongPhong();
				nhanSu.nhap(scan);
				nhanSu.tinhLuong();
				// thêm vào danh sách
				this.them(nhanSu);
				break;
			case 3:
				nhanSu = new GiamDoc();
				nhanSu.nhap(scan);
				nhanSu.tinhLuong();
				// thêm vào danh sách
				this.them(nhanSu);
				break;
			default:
				System.out.println("Vui lòng nhập từ 0 - 3");
			}
		} while (flag);
		return listNVThuongMoi;
	}
	
	public void xuat() {
		for(NhanSu ns: this.listNhanSu) {
			ns.xuat();
		}
	}
	
	public void tinhLuong() {
		for(NhanSu ns: this.listNhanSu) {
			ns.tinhLuong();
		}
	}
	
	public void them(NhanSu ns) {
		this.listNhanSu.add(ns);
	}
	
	public boolean xoaNhanSu(NhanSu ns) {
		boolean deleted = false;
		for(int i = this.listNhanSu.size() -1; i >0; i--) {
			NhanSu current = this.listNhanSu.get(i);
			if(ns.getMaso().equalsIgnoreCase(current.getMaso())){
				this.listNhanSu.remove(i);
				deleted = true;
				break;
			}
		}
		return deleted;
	}

}
