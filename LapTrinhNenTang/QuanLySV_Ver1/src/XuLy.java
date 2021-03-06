import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		SinhVien sv = new SinhVien();
		Scanner scan = new Scanner(System.in);
//		sv.nhap(scan);
//		sv.tinhDiemTB();
//		sv.xepLoai();
//		sv.xuat();

//		DanhSachSinhVien ds = new DanhSachSinhVien();
		TruongHoc truong = new TruongHoc();
		truong.nhap();
		truong.tinhDiemTB();
		truong.xepLoai();
		doMenu(truong);
	}

	private static void inMenu() {
		System.out.println("Vui long chon thuc hien:");
		System.out.println("1. Them sinh vien");
		System.out.println("2. Xuat danh sach sinh vien");
		System.out.println("3. Liet ke danh sach hoc sinh co diem trung binh cao nhat");
		System.out.println("4. Liet ke danh sach hoc sinh xep loai yeu");
		System.out.println("5. Tim sinh vien theo ten");
		System.out.println("6. Tim sinh vien theo ma");
		System.out.println("7. Xoa sinh vien theo ma");
		System.out.println("0. Thoat");
	}

	private static void doMenu(TruongHoc truong) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		do {
			inMenu();
			System.out.println("Vui long nhap");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				SinhVien sv = new SinhVien();
				sv.nhap(scan);
				truong.themSV(sv);
				break;
			case 2:
				truong.tinhDiemTB();
				truong.xepLoai();
				//truong.xuat();
				truong.xuatTheoFormat(truong.getDssvToanTruong().getListSV());
				break;
			case 3:
				ArrayList<SinhVien> listTBMax = truong.listDiemTBMax();
				truong.xuatTheoFormat(listTBMax);
				break;
			case 4:
				ArrayList<SinhVien> listXLYeu = truong.listSVYeu();
				truong.xuatTheoFormat(listXLYeu);
				break;
			case 5:
				System.out.println("Vui long nhap ten sinh vien can tim:");
				String ten = scan.nextLine();
				ArrayList<SinhVien> listSVTheoTen = truong.timSVTheoTen(ten);
				truong.xuatTheoFormat(listSVTheoTen);
				break;
			case 6:
				System.out.println("Vui long nhap ma sinh vien can tim:");
				int maSV = Integer.parseInt(scan.nextLine());
				SinhVien svFound = truong.timSVTheoMax(maSV);
				if (svFound != null) {
					svFound.xuat();
				} else {
					System.out.println("Khong tim thay sinh vien co ma: " + maSV);
				}
				break;
			case 7:
				System.out.println("Vui long nhap ma sinh vien can xoa");
				int maXoa = Integer.parseInt(scan.nextLine());
				boolean deleted = truong.xoaSVTheoMa(maXoa);
				if(deleted) {
					System.out.println("Xoa thanh cong");
				} else {
					System.out.println("Chua xoa duoc hoac ma sinh vien khong co trong danh sach");
				}
			case 0:
				flag = false;
				break;
			}
		} while (flag = true);
	}

}
