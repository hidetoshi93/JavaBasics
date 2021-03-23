import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vui long nhap diem toan: ");
		float toan = Float.parseFloat(scan.nextLine());
		
		System.out.println("Vui long nhap diem ly: ");
		float ly = Float.parseFloat(scan.nextLine());

		System.out.println("Vui long nhap diem hoa: ");
		float hoa = Float.parseFloat(scan.nextLine());
		
		SinhVien sv2 = new SinhVien("Mai", "maiphung@gmail.com");
		sv2.setDiemToan(toan);
		sv2.setDiemLy(ly);
		sv2.setDiemHoa(hoa);
		sv2.tinhDiemTB();
		
		System.out.println("ten: " + sv2.getHoTen() + "- Emai: "+ sv2.getEmail() + "- DiemTB: "+sv2.getDiemTB());
	}

}
