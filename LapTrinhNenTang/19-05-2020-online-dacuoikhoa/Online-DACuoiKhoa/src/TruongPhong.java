import java.util.Scanner;

/**
 * Mục đích: Xử lý nghiệp vụ cho lớp trưởng phòng
 * 
 * */
public class TruongPhong extends NhanSu {
	//Constants
	final int LUONG_NGAY = 200;
	final int PHU_CAP_MOI_NHAN_VIEN_QLY = 100;
	
	
	//1. Attributes
	private int soNhanVienDuoiQuyen;
	//2. Get, set
	
	/**
	 * @return the soNhanVienDuoiQuyen
	 */
	public int getSoNhanVienDuoiQuyen() {
		return soNhanVienDuoiQuyen;
	}

	/**
	 * @param soNhanVienDuoiQuyen the soNhanVienDuoiQuyen to set
	 */
	public void setSoNhanVienDuoiQuyen(int soNhanVienDuoiQuyen) {
		this.soNhanVienDuoiQuyen = soNhanVienDuoiQuyen;
	}

	//3. Constructors.
	public TruongPhong() {
		this.soNhanVienDuoiQuyen  = 0;
	}

	public TruongPhong(String maso, String hoTen, String soDienThoai, float soNgayLamViec) {
		super(maso, hoTen, soDienThoai, soNgayLamViec);
		this.soNhanVienDuoiQuyen  = 0;
	}
	//4. Input, output
	@Override 
	public void xuat() {
		super.xuat();
		System.out.println("\t Số Nhân viên:" + this.soNhanVienDuoiQuyen + "\t Lương: " + this.luong);
	}
	//5. Business 
	
	@Override
	public void tinhLuong() {
		this.luong = this.soNgayLamViec * LUONG_NGAY
				+ this.soNhanVienDuoiQuyen * PHU_CAP_MOI_NHAN_VIEN_QLY;
	}
	
	public void tangNhanVien() {
		this.soNhanVienDuoiQuyen++;
	}
	
	public void giamNhanVien() {
		this.soNhanVienDuoiQuyen--;
	}
	
}
