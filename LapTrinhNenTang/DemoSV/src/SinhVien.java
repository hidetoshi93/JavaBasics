/*
 * Muc dich: Xu ly cac nghiep vu lien quan den sinh vien
 * Nguoi tao: Tuan
 * Ngay tao:
 * Version: 1.0
 * 
 **/
public class SinhVien {
	private String hoTen;
	private String email;
	private float diemToan;
	private float diemHoa;
	private float diemLy;
	private float diemTB;
	
	//phuong thuc khoi tao khong tham so
	public SinhVien() {
		
	}
	
	//phuong thuc khoi tao co tham so
	public SinhVien(String ten, String mail) {
		this.hoTen = ten;
		this.email = mail;
	}
	
	//get, set method
	public void setHoTen(String _hoTen) {
		this.hoTen = _hoTen;
	}
	public String getHoTen() {
		return hoTen;
	}
	
	public void setEmail(String _email) {
		this.hoTen = _email;
	}
	public String getEmail() {
		return email;
	}
	
	public void tinhDiemTB() {
		this.diemTB = (this.diemToan + this.diemLy + this.diemHoa)/3;
	}
	
	
	public void setDiemToan(Float _diemToan) {
		this.diemToan = _diemToan;
	}
	public Float getDiemToan() {
		return diemToan;
	}
	
	public void setDiemLy(Float _diemLy) {
		this.diemLy = _diemLy;
	}
	public Float getDiemLy() {
		return diemLy;
	}
	
	public void setDiemHoa(Float _diemHoa) {
		this.diemHoa = _diemHoa;
	}
	public Float getDiemHoa() {
		return diemHoa;
	}
	
	public Float getDiemTB() {
		return diemTB;
	}
}
