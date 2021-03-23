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
		System.out.println("\nXuat mang ");
		for (int item : a) {
			System.out.print(item + "\t");
		}
	}

	public static int[] tronMang(int a[]) {
		int b[] = new int[a.length];

		for (int i = 0, j = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				b[i] = a[j];
				j++;
			} else {
				b[i] = a[j + (a.length / 2 - 1)];
			}
		}
		a = b;
		return a;
	}

	public static boolean isEqual(int a[], int b[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static int demSoLan(int a[], int b[]) {
		int count = 0;
		do {
			b = tronMang(b);
			xuatMangForEach(b);
			count++;
		} while (!isEqual(a, b));
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		int b[] = a;
		xuatMangForEach(a);
		a = tronMang(a);
		xuatMangForEach(a);
		int count = demSoLan(a, b);
		System.out.println("Sau "+ count + " lan thi mang quay ve nhu ban dau");
		
		
	}

}