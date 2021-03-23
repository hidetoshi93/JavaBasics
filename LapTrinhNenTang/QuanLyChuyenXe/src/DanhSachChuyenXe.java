import java.util.ArrayList;
import java.util.Scanner;

/*
 * Muc dich: Xu ly cac nghiep vu lien quan den danh sach chuyen xe
 * Nguoi tao:
 * Ngay tao: 
 * Version:
 */
public class DanhSachChuyenXe {
//	1. Attributes
	
	ArrayList<ChuyenXe> listChuyenXe;
	private float tongDoanhThu;
	private float doanhThuNoi;
	private float doanhThuNgoai;
//	2. get,set
	
	public ArrayList<ChuyenXe> getListChuyenXe() {
		return listChuyenXe;
	}


	public void setListChuyenXe(ArrayList<ChuyenXe> listChuyenXe) {
		this.listChuyenXe = listChuyenXe;
	}
	
	public float getTongDoanhThu() {
		return tongDoanhThu;
	}

	public float getDoanhThuNoi() {
		return doanhThuNoi;
	}
	
	public float getDoanhThuNgoai() {
		return doanhThuNgoai;
	}

//	3. Constructor methods
	public DanhSachChuyenXe() {
		listChuyenXe = new ArrayList<ChuyenXe>();
	}

//	4. input,output methods
	public void nhap(Scanner scan) {
		boolean flag = true;
		ChuyenXe chuyenXe;
		do {
			System.out.println("1. Chuyen xe noi thanh");
			System.out.println("2. Chuyen xe ngoai thanh");
			System.out.println("0. Thoat");
			
			int chon = Integer.parseInt(scan.nextLine());
			switch(chon) {
			case 1:
				chuyenXe = new ChuyenXeNoiThanh();
				chuyenXe.nhap(scan);
				this.listChuyenXe.add(chuyenXe);
				break;
			case 2: 
				chuyenXe = new ChuyenXeNgoaiThanh();
				chuyenXe.nhap(scan);
				this.listChuyenXe.add(chuyenXe);
				break;
			case 0:
				flag = false;
				break;
			}
		}while(flag);
	}
	
	public void xuat() {
		for(ChuyenXe cx: this.listChuyenXe) {
			cx.xuat();
		}
	}
	
//	5. business methods
	public void tinhTongDoanhThu() {
		this.tongDoanhThu = 0;
		for(ChuyenXe cx: listChuyenXe) {
			this.tongDoanhThu += cx.getDoanhThu();
		}
	}

	public void tinhDoanhThuNoi() {
		this.doanhThuNoi = 0;
		for(ChuyenXe cx: this.listChuyenXe) {
			if(cx instanceof ChuyenXeNoiThanh) {
				this.doanhThuNoi += cx.getDoanhThu();
			}
		}
	}
	
	public void tinhDoanhThuNgoai() {
		this.doanhThuNgoai = 0;
		for(ChuyenXe cx: this.listChuyenXe) {
			if(cx instanceof ChuyenXeNgoaiThanh) {
				this.doanhThuNgoai += cx.getDoanhThu();
			}
		}
	}
	
	public void  dummyData() {
		ChuyenXe chuyenXe;
		chuyenXe = new ChuyenXeNoiThanh("1", "noi 1", "01", 1200, "so 1", 35);
		this.listChuyenXe.add(chuyenXe);
		
		chuyenXe = new ChuyenXeNoiThanh("2", "noi 2", "02", 1200, "so 2", 5.6f);
		this.listChuyenXe.add(chuyenXe);
		
		chuyenXe = new ChuyenXeNgoaiThanh("3", "ngoai 1", "03", 2000, "Nam Dinh", 2);
		this.listChuyenXe.add(chuyenXe);
		
		chuyenXe = new ChuyenXeNgoaiThanh("4", "ngoai 2", "04", 2000, "Ha Noi", 8.6f);
		this.listChuyenXe.add(chuyenXe);
		
		chuyenXe = new ChuyenXeNgoaiThanh("5", "ngoai 3", "05", 5000, "Nghe An", 15.4f);
		this.listChuyenXe.add(chuyenXe);
				
	}
	
	public float tinhDoanhThuChuyenXeNamDinh() {
		float doanhThu = 0;
		for(ChuyenXe cx: this.listChuyenXe) {
			if(cx instanceof ChuyenXeNgoaiThanh) {
				ChuyenXeNgoaiThanh cxNgoai = ((ChuyenXeNgoaiThanh)cx); //casting-ep kieu trong OOP
				if(cxNgoai.getNoiDen().equalsIgnoreCase("Nam Dinh")) {
					doanhThu += cxNgoai.getDoanhThu();
				}
			}
		}
		return doanhThu;
	}
	
}
