import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Mục đích: Tạo ra lớp Công ty quản lý các nghiệp vụ liên quan
 * */
public class CongTy {
	// 1. Attributes

	private String tenCongTy;
	private String maSoThue;
	private float doanhThuThang;
	private DanhSachNhanSu objListNhanSu;
	// 2. get, set

	/**
	 * @return the tenCongTy
	 */
	public String getTenCongTy() {
		return tenCongTy;
	}

	/**
	 * @param tenCongTy the tenCongTy to set
	 */
	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	/**
	 * @return the maSoThue
	 */
	public String getMaSoThue() {
		return maSoThue;
	}

	/**
	 * @param maSoThue the maSoThue to set
	 */
	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	/**
	 * @return the doanhThuThang
	 */
	public float getDoanhThuThang() {
		return doanhThuThang;
	}

	/**
	 * @param doanhThuThang the doanhThuThang to set
	 */
	public void setDoanhThuThang(float doanhThuThang) {
		this.doanhThuThang = doanhThuThang;
	}

	/**
	 * @return the objListNhanSu
	 */
	public DanhSachNhanSu getObjListNhanSu() {
		return objListNhanSu;
	}

	/**
	 * @param objListNhanSu the objListNhanSu to set
	 */
	public void setObjListNhanSu(DanhSachNhanSu objListNhanSu) {
		this.objListNhanSu = objListNhanSu;
	}

	// 3. Constructor
	public CongTy() {
		this.objListNhanSu = new DanhSachNhanSu();
	}

	// 4. input, output
	public void nhap(Scanner scan) {
		System.out.println("****** Nhập thông tin công ty *********");
		System.out.print("Tên công ty: ");
		this.tenCongTy = scan.nextLine();

		System.out.print("Mã số thuế: ");
		this.maSoThue = scan.nextLine();

		System.out.print("Doanh thu: ");
		this.doanhThuThang = Float.parseFloat(scan.nextLine());

	}

	public void xuat() {
		System.out.println("******* Thông tin công ty ********");
		System.out.println("Tên công ty: " + this.tenCongTy);
		System.out.println("Mã số thuế: " + this.maSoThue);
		System.out.println("Doanh thu tháng: " + this.doanhThuThang);
		System.out.println("**************************************");
		this.objListNhanSu.xuat();
	}

	// 5. Business method
	public void tinhLuong() {
		this.objListNhanSu.tinhLuong();
	}

	public void dummyDataCty() {
		this.tenCongTy = "CyberSoft-CyberLearn";
		this.maSoThue = "01292332";
		this.doanhThuThang = 435334f;
	}

	public void dummyDataNhanSu() {
		NhanSu ns = new NhanSu();
		ns = new TruongPhong("13", "TP Bổ sung 1", "098233", 24);
		objListNhanSu.them(ns);
		ns = new TruongPhong("14", "TP Bổ sung 2", "091833", 21);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong("1", "Lan", "09832", 20);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong("2", "Hưng", "098232", 23);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong("3", "Việt", "098132", 31);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong("4", "An", "091832", 25);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong("5", "Tuyết", "098432", 23);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong("6", "Mỹ", "092832", 31);
		objListNhanSu.them(ns);

		ns = new TruongPhong("8", "TP Mai", "098233", 24);
		objListNhanSu.them(ns);
		ns = new TruongPhong("9", "TP Luân", "091833", 21);
		objListNhanSu.them(ns);
		ns = new TruongPhong("10", "TP Kiệt", "091833", 23);
		objListNhanSu.them(ns);

		ns = new GiamDoc("11", "GD Tiên", "0981", 19, 80);
		objListNhanSu.them(ns);
		ns = new GiamDoc("12", "GD Huệ", "09181", 21, 20);
		objListNhanSu.them(ns);
	}

	/**
	 * Phân bổ nhân viên về phòng ban, hay có nghĩa là chỉ định Trưởng phòng cho
	 * nhân viên Bước 1: Duyệt danh sách và kiểm tra nếu là NhanVienThuong Bước 2:
	 * Show danh sách Trưởng phòng (Tên và mã) Bước 3: Có muốn phân bổ hay không,
	 * chọn 'Y' để phân bổ, chọn 'N" để đi tiếp Bước 4: Nếu 'N' đi tiếp đến nhân
	 * viên tiếp theo Bước 5: Nếu 'Y', Yêu cầu nhập mã trường phòng đã liệt kê ở
	 * bước 2 Bước 6: Kiểm tra mã nhập bước 5 có nằm trong ds Mã trưởng phòng bước 2
	 * hay không Bước 7: Nếu có: Lấy trưởng phòng với mã đã chọn bước 5 -> Lấy ra
	 * object Trưởng phòng Bước 8: Gán trưởng phòng bước 7 cho Trưởng phòng của Nhân
	 * viên đang duyệt Bước 9: Nếu không: Lặp lại bước 5 Bước 10: Tăng số lượng nhân
	 * viên dưới quyền cho Trưởng Phòng đó
	 */

	public void phanBoNhanVienThuong() {
		Scanner scan = new Scanner(System.in);
		// Buoc1
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {
				// Bước 2:
				// In ra thông báo tên và mã của Nhân viên thường để biết phân bổ
				System.out.println("Đang phân bổ cho nhân viên:");
				ns.xuatMaVaTen();
				phanBoChoMotNhanSu(scan, ns);
			}
		}
	}

	private void phanBoChoMotNhanSu(Scanner scan, NhanSu ns) {
		// ********* start Phân bổ cho một nhân sự
		showMaVaTenTPhong();
		boolean flag = true;
		do {
			// Bước 3
			System.out.println("Chọn 1 để phân bổ hoặc chọn 2 để đi tiếp.");
			int chon = Integer.parseInt(scan.nextLine());
			if (chon == 1 || chon == 2) {
				if (chon == 1) {// Bước 5
					TruongPhong tp = chonTruongPhong(scan);
					// Bước 7 đã có trưởng phòng lưu tại biến tp
					// Bước 8
					((NhanVienThuong) ns).setTruongPhong(tp);
					// Bước 10:
					tp.tangNhanVien();
				}
				flag = false;// Bước 4
			} else {
				System.out.println("Chỉ được nhập 1 hoặc 2");
				flag = true;
			}
		} while (flag);
		////// **** End phân bổ cho một nhân sự ********
	}

	private TruongPhong chonTruongPhong(Scanner scan) {
		TruongPhong tp = null;
		do {
			System.out.println("Vui lòng chọn Mã TP đã liệt kê trên");
			String chonMa = scan.nextLine();
			// Bước 6: Kiểm tra mã có nằm trong ds hay không
			tp = timTruongPhongTheoMa(chonMa);
		} while (tp == null);
		return tp;
	}

	private void showMaVaTenTPhong() {
		System.out.println("******* Danh sách Trưởng Phòng *******");
		ArrayList<TruongPhong> list = layDSTruongPhong();
		for (TruongPhong tp : list) {
			tp.xuatMaVaTen();
		}
		System.out.println("===================================");
	}

	public void lietKeDSTruongPhong() {
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				ns.xuatMaVaTen();
			}
		}
	}

	public TruongPhong timTruongPhongTheoMa(String ma) {
		TruongPhong tphong = null; // chưa tìm thấy
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				if (ns.getMaso().compareTo(ma) == 0) {
					tphong = (TruongPhong) ns;
				}
			}
		}
		return tphong;
	}

	public ArrayList<TruongPhong> layDSTruongPhong() {
		ArrayList<TruongPhong> list = new ArrayList<TruongPhong>();
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				list.add((TruongPhong) ns);
			}
		}
		return list;
	}

	public void themNhanSu(Scanner scan) {
		System.out.println("****** Chức năng thêm nhân sự ******");
		ArrayList<NhanVienThuong> list = this.objListNhanSu.nhap(scan);
		for (NhanVienThuong nvt : list) {
			phanBoChoMotNhanSu(scan, nvt);
		}
	}

	/*
	 * Các phương thức hỗ trợ xóa nhân sự
	 */
	public boolean xoaNhanSu(Scanner scan) {
		boolean deleted = false; // chưa xóa
		System.out.println("********** Xóa nhân sự ***********");
		System.out.println("Vui lòng nhập Mã nhân sự cần xóa");
		String maXoa = scan.nextLine();
		NhanSu nhanSu = timNhanSuTheoMa(maXoa);
		if (nhanSu != null) { // Tìm thấy và xử lý
			if (nhanSu instanceof TruongPhong) {// Nếu Trưởng phòng
				deleted = xoaTruongPhong((TruongPhong) nhanSu);
			} else if (nhanSu instanceof NhanVienThuong) {// Nếu Nhân viên thường
				deleted = xoaNhanVienThuong((NhanVienThuong) nhanSu);
			} else {// Nếu Giám đốc
				this.objListNhanSu.getListNhanSu().remove(nhanSu);
			}

		} else {
			System.out.println("Mã nhân sự bạn vừa nhập không có trong danh sách!");
		}

		return deleted;
	}

	public boolean xoaNhanVienThuong(NhanVienThuong nvt) {
		boolean deleted = false; // xóa chưa thành công
		/*
		 * 1. Lấy Trường phòng đang quản lý 2. Kiểm tra khác null 3. Tìm Trưởng phòng
		 * trong DS Trưởng phòng có mã TP bằng với TP trong bước 1 4. Giảm số lượng nhân
		 * viên của Trưởng phòng đang quản lý 5. Xóa Nhân viên thường khỏi danh sách
		 * 
		 */
		TruongPhong tp = nvt.getTruongPhong();
		if (tp != null) {
			tp.giamNhanVien();

		}
		this.objListNhanSu.getListNhanSu().remove(nvt);
		deleted = true;
		return deleted;
	}

	public boolean xoaTruongPhong(TruongPhong tp) {
		boolean deleted = false; // chưa xóa
		/*
		 * 1. Duyệt danh sách nhân sự và kiểm tra nếu là nhân viên thường 2. Kiểm tra
		 * Trường phòng trong NV Thường khác null 3. Kiểm tra mã TP của NV đang duyệt và
		 * mã TP cần xóa, nếu bằng nhau 4. Gán Trưởng phòng trong NVThuong là null 5.
		 * Xóa Trường phòng Xóa khỏi list Nhân Sự
		 */
		for (NhanSu ns : this.objListNhanSu.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {
				TruongPhong tPhongNVThuong = ((NhanVienThuong) ns).getTruongPhong();
				if (tPhongNVThuong != null) {
					if (tp.getMaso().equalsIgnoreCase(tPhongNVThuong.getMaso())) {
						((NhanVienThuong) ns).setTruongPhong(null);
						deleted = true; // xoa thành công
					}
				}
			}
		}

		this.objListNhanSu.getListNhanSu().remove(tp);
		return deleted;

	}

	public NhanSu timNhanSuTheoMa(String ma) {
		NhanSu nhanSu = null;// Chưa tìm thấy
		for (NhanSu ns : this.objListNhanSu.getListNhanSu()) {
			if (ns.getMaso().equalsIgnoreCase(ma)) {
				nhanSu = ns; // Tìm thấy rùi
				break;
			}
		}
		return nhanSu;
	}

	public ArrayList<NhanVienThuong> lietKeDSNTVLuongCaoNhat() {
		ArrayList<NhanVienThuong> list = new ArrayList<NhanVienThuong>();
		// 1. Tìm Nhan Vien Thuong đầu tiên trong ds nhan sự
		NhanVienThuong nvt = null;// Chưa tìm thấy
		int indexMax = 0;
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			indexMax++;
			if (ns instanceof NhanVienThuong) {
				nvt = (NhanVienThuong) ns;
				break;
			}

		}
		// 2. Nếu có, thì cho NVT vừa tìm trong bước 1 là NVT có lương cao nhất
		if (nvt != null) {
			// 3. Duỵet DS từ vị trí vừa tìm ở bước 2 và tìm NVT có lương thật sự cao nhất
			for(int i = indexMax -1; i< objListNhanSu.getListNhanSu().size(); i++ ) {
				NhanSu current = objListNhanSu.getListNhanSu().get(i); 
				if(current instanceof NhanVienThuong) {
					if(current.getLuong() > nvt.getLuong()) {
						nvt = (NhanVienThuong) current;
						indexMax++;
					}
				}
			}
			// 4. Duỵet lại DS và so sánh lương của NVT đang duyệt với NVT max thực sự ở
			// bước 3 --> them vào danh sách
			for(int i = indexMax - 1; i< objListNhanSu.getListNhanSu().size(); i++) {
				NhanSu current = objListNhanSu.getListNhanSu().get(i); 
				if(current instanceof NhanVienThuong) {
					if(current.getLuong() == nvt.getLuong()) {
						list.add(nvt);
					}
				}
			}
		}

		return list;
	}
	
	private void interchangeSort(ArrayList<NhanSu> _list) {
		int i;
		int j;
		for(i = 0 ; i< _list.size() -1 ; i++ ) {
			for(j = i+ 1; j <_list.size(); j++) {
				NhanSu personI = _list.get(i);
				NhanSu personJ = _list.get(j);
				if(personJ.getHoTen().compareToIgnoreCase(personI.getHoTen()) < 0) {
					Collections.swap(_list, i, j);
				}
			}
		}
		
	}
	
	public void sortName() {
		interchangeSort(this.objListNhanSu.getListNhanSu());
	}


}
