import java.util.*;

/*
 * 目的：　取引に関する業務の管理リスト配列
 * 作成人： トゥアン
 * 作成日： 2021/03/31
 * バージョン：　v1.0
 */
public class DanhSachGiaoDich {
	
	final int MOT_TY = 1000;
	// 1. Attributes
	private ArrayList<GiaoDich> listGiaoDich;
	private int tongSLGiaoDichVang;
	private int tongSLGiaoDichTienTe;
	private float trungBinhGiaoDichTienTe;

	// 2. Get, set methods
	public ArrayList<GiaoDich> getListGiaoDich() {
		return listGiaoDich;
	}

	public void setListGiaoDich(ArrayList<GiaoDich> listGiaoDich) {
		this.listGiaoDich = listGiaoDich;
	}

	public int getTongSLGiaoDichVang() {
		return tongSLGiaoDichVang;
	}

	public int getTongSLGiaoDichTienTe() {
		return tongSLGiaoDichTienTe;
	}

	public float getTrungBinhGiaoDichTienTe() {
		return trungBinhGiaoDichTienTe;
	}
	
	// 3. Constructor methods
	public DanhSachGiaoDich() {
		listGiaoDich = new ArrayList<GiaoDich>();
	}

	public DanhSachGiaoDich(ArrayList<GiaoDich> listGiaoDich) {
		this.listGiaoDich = listGiaoDich;
	}

	// 4. Input, output methods
	public void nhap(Scanner scan) {
		boolean flag = true;
		GiaoDich giaoDich;
		do {
			System.out.println("Vui long chon loai giao dich: ");
			System.out.println("1. Nhap giao dich vang");
			System.out.println("2. Nhap giao dich tien te");
			System.out.println("0. Thoat");
			int sellected = Integer.parseInt(scan.nextLine());
			switch (sellected) {
			case 1:
				giaoDich = new GiaoDichVang();
				giaoDich.nhap(scan);
				giaoDich.tinhTien();
				listGiaoDich.add(giaoDich);
				break;
			case 2:
				giaoDich = new GiaoDichTienTe();
				giaoDich.nhap(scan);
				giaoDich.tinhTien();
				listGiaoDich.add(giaoDich);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Vui long nhap 1, 2, 3");
			}
		} while (flag);
	}
	
	public void xuat() {
		for(GiaoDich gd:listGiaoDich) {
			gd.xuat();
		}
	}
	
	// 5. Business methods
	public void tinhTongGDVang() {
		this.tongSLGiaoDichVang = 0;
		for(GiaoDich gd: this.listGiaoDich) {
			if(gd instanceof GiaoDichVang) {
				tongSLGiaoDichVang += gd.soLuong;
			}
		}
	}
	
	public void tinhTongGDTienTe() {
		this.tongSLGiaoDichTienTe = 0;
		for(GiaoDich gd: this.listGiaoDich) {
			if(gd instanceof GiaoDichTienTe) {
				tongSLGiaoDichTienTe += gd.soLuong;
			}
		}
	}
	
	public void tinhTBThanhTienTienTe() {
		float thanhTien = 0;
		for(GiaoDich gd: this.listGiaoDich) {
			if(gd instanceof GiaoDichTienTe) {
				thanhTien += ((GiaoDichTienTe)gd).getThanhTien();
			}
		}
		this.trungBinhGiaoDichTienTe = thanhTien/tongSLGiaoDichTienTe;
	}
	
	public void xuatGDTheoTieuChi() {
		for(GiaoDich gd: listGiaoDich) {
			if(gd.getThanhTien() > MOT_TY) {
				gd.xuat();
			}
		}
	}
	
	public void tinhTienCacGiaoDich() {
		for(GiaoDich gd: this.listGiaoDich) {
			gd.tinhTien();
		}
	}
	
	public void dummyData() {
		GiaoDich giaoDich = new GiaoDichVang(1, 1, 1, 2020, 4, 5, "SJC");
		this.listGiaoDich.add(giaoDich);
		
		giaoDich = new GiaoDichVang(2, 1, 1, 2020, 5, 10, "9999");
		this.listGiaoDich.add(giaoDich);
		
		giaoDich = new GiaoDichVang(3, 1, 1, 2020, 12, 11, "4K");
		this.listGiaoDich.add(giaoDich);
		
		giaoDich = new GiaoDichTienTe(4, 31, 03, 2021, 1100, 10, 2300, 2);
		this.listGiaoDich.add(giaoDich);
		
		giaoDich = new GiaoDichTienTe(5, 31, 03, 2021, 1400, 10, 2500, 1);
		this.listGiaoDich.add(giaoDich);
		
	}
}
