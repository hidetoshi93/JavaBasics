import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ten;
		float diemToan;
		float diemLy;
		float diemHoa;
		float diemTB;
		String xepLoai;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Vui long nhap ten sinh vien : ");
		ten = scan.nextLine();
		
		System.out.print("Vui long nhap diem mon toan : ");
		diemToan = Float.parseFloat(scan.nextLine());
		
		System.out.print("Vui long nhap diem mon ly : ");
		diemLy = Float.parseFloat(scan.nextLine());
		
		System.out.print("Vui long nhap diem mon hoa : ");
		diemHoa = Float.parseFloat(scan.nextLine());
		
		diemTB = (diemToan + diemLy + diemHoa)/3;
		
		if(diemTB >= (8.5f)) {
			xepLoai = "Gioi";
		} else if (diemTB >= (6.5f)) {
			xepLoai = "Kha";
		} else if (diemTB >= 5) {
			xepLoai = "Trung binh";
		} else {
			xepLoai = "Yeu";
		}
		
		System.out.println(" Diem trung binh " + diemTB + "\t Xep loai : " + xepLoai);
		
		
		
	}

}
