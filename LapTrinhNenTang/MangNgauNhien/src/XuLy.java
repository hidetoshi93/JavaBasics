import java.util.Scanner;

public class XuLy {

	final static int MIN = -100;
	final static int MAX = 100;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static int nhapN(Scanner scan) {
		int n;

		do {
			System.out.print("Nhap n > 0 : ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);

		return n;
	}

	public static int[] taoMang(int n) {
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}

		return a;
	}

	public static void xuatMangForEach(int a[]) {
		System.out.println("Xuat mang ");
		for (int item : a) {
			System.out.print(item + "\t");
		}
	}
	
	public static int timSoDuongChanDauTien(int a[]) {
		int soDuongChanDauTien = 0;
		
		for (int item : a) {
			if (item > 0 && item % 2 ==0) {
				soDuongChanDauTien = item;
				break;
			} 
		}
		
		return soDuongChanDauTien;	
		
	}

	public static void timSoDuongChanMin(int a[]) {
		int soDuongChanMin = timSoDuongChanDauTien(a);
		
		if (soDuongChanMin == 0) {
			System.out.println("\nMang khong co so duong chan");
		} else {
			for (int item : a) {
				if (item > 0 && item < soDuongChanMin && item % 2 == 0) {
					soDuongChanMin = item;
				}
			}
			System.out.println("\nSo duong nho nhat trong mang la: " + soDuongChanMin);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMangForEach(a);
		timSoDuongChanMin(a);
	}

}
