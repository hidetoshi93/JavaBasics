import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void inMenu() {
		System.out.println("Vui long chon va nhap");
		System.out.println("1. Tinh tong");
		System.out.println("2. Tinh hieu");
		System.out.println("3. Tinh nhan");
		System.out.println("4. Tinh chia");
		System.out.println("0. Thoat");
		
	}

	public static void chonMenu(Scanner scan, float a, float b) {
		boolean flag = true;
		int chon;
		do {
			inMenu();
			System.out.println("Moi chon >>");
			chon = Integer.parseInt(scan.nextLine());

			switch (chon) {
			case 0:
				flag = false;
				break;
			case 1:
				float tong = a + b;
				System.out.println("Tong 2 so a, b la: " + tong);
				break;
			case 2:
				float hieu = a - b;
				System.out.println("Tong 2 so a, b la: " + hieu);
				break;
			case 3:
				float tich = a + b;
				System.out.println("Tong 2 so a, b la: " + tich);
				break;
			case 4:
				if(b == 0) {
					System.out.println("b phai la so khac 0");
				}else {
					float thuong = a / b;
					System.out.println("Tong 2 so a, b la: " + thuong);
				}
				break;
			default:
				System.out.println("Vui long chon so tu 0-4");
			}
		} while (flag);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vui long nhap so a : ");
		Scanner scan = new Scanner(System.in);
		float a = Float.parseFloat(scan.nextLine());
		
		System.out.println("Vui long nhap so b : ");
		float b = Float.parseFloat(scan.nextLine());
		
		chonMenu(scan, a, b);
	}

}
