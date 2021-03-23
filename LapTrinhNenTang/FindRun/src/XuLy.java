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
	
	public static void printMaxRun(int a[]) {
		int head = 0;
		int maxHead = 0;
		int maxLen = 0;
		
		do {
			int i = 0;
			int len = 0;
			for (i = head; i <a.length -1 && a[i] < a[i + 1]; i++) {
				len++;
			}
			
			if (len > maxLen) {
				maxLen = len;
				maxHead = head;
			}
			head = i + 1;
		} while (head < a.length);
		
		System.out.println("\nRun dai nhat la");
		
		for (int i =0; i <= maxLen; i++) {
			System.out.print(a[maxHead + i] + "\t");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMangForEach(a);
		printMaxRun(a);
	}

}