import java.util.ArrayList;
import java.util.Scanner;

/*
 * Muc dich: Tao ra de quan ly danh sach nhieu sinh vien
 * Nguoi tao: 
 * Ngay tao:
 * Verson: 1.0
 */
public class DanhSachSinhVien {

//	1. Attritbutes

	private ArrayList<SinhVien> listSV;

//	2. Get,set methods

	public ArrayList<SinhVien> getListSV() {
		return listSV;
	}

	public void setListSV(ArrayList<SinhVien> _listSV) {
		this.listSV = _listSV;
	}

//	3. Constructor methods

	public DanhSachSinhVien() {
		thietLapDefault();
	}

	private void thietLapDefault() {
		this.listSV = new ArrayList<SinhVien>();
	}

//	4. Input, Output methods

	public void nhap(Scanner scan) {
		for (SinhVien sv : this.listSV) {
			sv.nhap(scan);
		}
	}

	public void xuat() {
		for (SinhVien sv : this.listSV) {
			sv.xuat();
		}
	}

	public void themSinhVien(SinhVien _sinhVien) {
		this.listSV.add(_sinhVien);
	}

//	5. Business methods

	public void tinhDiemTB() {
		for (SinhVien sv : this.listSV) {
			sv.tinhDiemTB();
		}
	}

	public void xepLoai() {
		for (SinhVien sv : this.listSV) {
			sv.xepLoai();
		}
	}

	public ArrayList<SinhVien> listDiemTBMax() {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		if (this.listSV.size() > 0) {
			SinhVien svMax = this.listSV.get(0);
			int vitriMax = 0;
			for (int i = 0; i < this.listSV.size(); i++) {
				SinhVien svCurrent = this.listSV.get(i);
				if (svCurrent.getDiemTB() > svMax.getDiemTB()) {
					svMax = svCurrent;
					vitriMax = i;
				}
			}
			
			// Them svMax vao list
			list.add(svMax);

			// Da tim thay svMax
			for (int i = vitriMax + 1; i < this.listSV.size(); i++) {
				SinhVien svCurrent = this.listSV.get(i);
				if (svCurrent.getDiemTB() == svMax.getDiemTB()) {
					list.add(svCurrent);
				}
			}
		}
		return list;
	}
	
	public ArrayList<SinhVien> listSVYeu(){
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		if(this.listSV.size() > 0) {
			for(SinhVien sv: this.listSV) {
				if(sv.getDiemTB() < 6) {
					list.add(sv);
				}
			}
		}
		return list;
	}
	
	public boolean xoaSVTheoMa(int maSV) {
		boolean deleted = false; //chua xoa
		for (SinhVien sv:this.listSV) {
			if(sv.getMaSV() == maSV) {
				this.listSV.remove(maSV);
				deleted = true; // xoa thanh cong
				break;
			}
		}
		return deleted;
	}
	

}
