import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		doMenu(scan);
	}
	
	private static void inMenu() {
		System.out.println("Chon chuc nang: ");
		System.out.println("1. Nhap giao dich");
		System.out.println("2. Tinh tong so luong cho tung loai");
		System.out.println("3. Tinh trung binh thanh tien cho giao dich ngoai te");
		System.out.println("4. Xuat giao dich co tri gia hon 1 ty");
		System.out.println("0. Thoat");
	}
	
	private static void doMenu(Scanner scan) {
		boolean flag = true;
		DanhSachGiaoDich xuLyGiaoDich = new DanhSachGiaoDich();
		xuLyGiaoDich.dummyData();
		xuLyGiaoDich.tinhTienCacGiaoDich();
		do {
			inMenu();
			System.out.println("Moi chon");
			int chon = Integer.parseInt(scan.nextLine());
			switch(chon) {
			case 0: 
				flag = false;
				break;
			case 1:
				xuLyGiaoDich.nhap(scan);
				break;
			case 2:
				xuLyGiaoDich.tinhTongGDTienTe();
				xuLyGiaoDich.tinhTongGDVang();
				System.out.println("Tong so luong giao dich tien te: " + xuLyGiaoDich.getTongSLGiaoDichTienTe());
				System.out.println("Tong so luong giao dich vang: " + xuLyGiaoDich.getTongSLGiaoDichVang());
				break;
			case 3:
				xuLyGiaoDich.tinhTBThanhTienTienTe();
				System.out.println("Trung binh thanh tien giao dich tien te: " + xuLyGiaoDich.getTrungBinhGiaoDichTienTe());
				break;
			case 4:
				xuLyGiaoDich.xuatGDTheoTieuChi();
				break;
			}
		} while (flag);
	}

}
