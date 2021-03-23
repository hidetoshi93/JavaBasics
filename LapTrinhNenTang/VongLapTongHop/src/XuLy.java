import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void xuLySo(int n) {
		int soBanDau = n;
		int soDangTach;
		int tongCacSo = 0;
		int dem = 0;

		do {
			soDangTach = soBanDau % 10;
			dem++;
			tongCacSo += soDangTach;
			soBanDau /= 10;
		} while (soBanDau != 0);

		System.out.println("So" + n + "co" + dem + "chu so");
		System.out.println("Chu so cuoi cung la: " + n % 10);
		System.out.println("Chu so dau tien la: " + soDangTach);
		System.out.println("Tong cac chu so: " + tongCacSo);

		System.out.print("So dao nguoc cua " + n + "la: ");
		while (n % 10 == 0) {
			n /= 10;
		}

		do {
			System.out.println("" + n % 10);
		} while (n != 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap so n: ");
		int n = Integer.parseInt(scan.nextLine());
		xuLySo(n);
	}

}
