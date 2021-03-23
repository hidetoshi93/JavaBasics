import java.util.ArrayList;

/*
 * Muc dich: Quan ly nghiep vu toan truong
 * Nguoi tao: 
 * Nguoi tao:
 * Version:1.0
 */
public class TruongHoc {
//	1. Attributes
	private DanhSachSinhVien dssvToanTruong;
	
//	2. Get, set methods
	public DanhSachSinhVien getDssvToanTruong() {
		return dssvToanTruong;
	}

	public void setDssvToanTruong(DanhSachSinhVien dssvToanTruong) {
		this.dssvToanTruong = dssvToanTruong;
	}
	
//	3. Constructor methods
	public TruongHoc() {
		this.dssvToanTruong = new DanhSachSinhVien();
	}
	
//	4. Input, output methods
	public void nhap() {
		SinhVien sv = new SinhVien("Lan", 1, 9.2f, 9, 9);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Hung", 2, 4.2f, 4, 5.2f);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Lan", 3, 7.2f, 4, 9);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Yen", 4, 3.2f, 4, 4);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Toan", 5, 9.2f, 7, 6);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Huu", 6, 4.2f, 4, 5.2f);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Ly", 7, 9.2f, 9, 9);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Tung", 8, 9.2f, 10, 10);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Quyen", 9, 7.2f, 8, 8.2f);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Linh", 10, 4.2f, 4, 5.2f);
		this.dssvToanTruong.themSinhVien(sv);
	}
	
	public void xuat() {
		this.dssvToanTruong.xuat();
	}
	
	
//	5. Business methods
	public void themSV(SinhVien _sinhVien) {
		this.dssvToanTruong.themSinhVien(_sinhVien);
	}
	
	public void tinhDiemTB() {
		this.dssvToanTruong.tinhDiemTB();
	}
	
	public void xepLoai() {
		this.dssvToanTruong.xepLoai();
	}
	
	public ArrayList<SinhVien> listDiemTBMax(){
		return this.dssvToanTruong.listDiemTBMax();
	}
	
	public ArrayList<SinhVien> listSVYeu(){
		return this.dssvToanTruong.listSVYeu();
	}
	
	public void xuatHelper(ArrayList<SinhVien> list) {
		for(SinhVien sv: list) {
			sv.xuat();
		}
	}
	
	public ArrayList<SinhVien> timSVTheoTen(String tenSV){
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		for(SinhVien sv: dssvToanTruong.getListSV()) {
			if(sv.getTenSV().equalsIgnoreCase(tenSV)) {
				list.add(sv);
			}
		}
		return list;
	}
	
	public SinhVien timSVTheoMax(int maSV){
		SinhVien sv = null; // chua tim thay
		for(SinhVien _sv: dssvToanTruong.getListSV()) {
			if(sv.getMaSV() == maSV) {
				sv = _sv;
				break;
			}
		}
		return sv;
	}
	
	public boolean xoaSVTheoMa(int maSV) {
		return dssvToanTruong.xoaSVTheoMa(maSV);
	}
	
	private void xuatLine() {
		System.out.println("===================================================================================================================");
	}
	
	private String formatCell(String paddLeft, String tittle, String paddRight) {
		return String.format(paddLeft, " ")+ tittle + String.format(paddRight, " ");
	}
	
	private void xuatRowHeader() {
		String paddString1 = "%3s";
		String paddString2 = "%4s";
		String paddString3 = "%5s";
		String paddString4 = "%6s";
		
		xuatLine();
		String text;
		text = "||" + formatCell(paddString1, "STT", paddString1) + "|";
		text += formatCell(paddString2, "Ma SV", paddString2)+ "|";
		text += formatCell(paddString3, "Ten SV", paddString2)+ "|";
		text += formatCell(paddString3, "Toan", paddString2)+ "|";
		text += formatCell(paddString3, "Ly", paddString4)+ "|";
		text += formatCell(paddString3, "Hoa", paddString3)+ "|";
		text += formatCell(paddString3, "DTB", paddString3)+ "|";
		text += formatCell(paddString2, "XepLoai", paddString2) + "||";
		System.out.println(text);
		xuatLine();
	}
	
	private void xuatCellThuTu(int i) {
		String paddLeft = "%3s";
		String paddRight = "%-6s";
		String text = "||" + String.format(paddLeft, " ") + String.format(paddRight, "" + i) + "|";
		System.out.print(text);
	}
	
	public void xuatTheoFormat(ArrayList<SinhVien> list) {
		System.out.println(list.size());
		xuatRowHeader();
		int i = 1;
		for (SinhVien sv : list) {
			xuatCellThuTu(i);
			sv.xuatRowFormat();
			i++;
		}
	}

}
