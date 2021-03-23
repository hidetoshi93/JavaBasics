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
	
	public static void lietKePTKhoangCachMax(int a[], Scanner scan) {
		System.out.println("\nVui long nhap vao gia tri x: ");
		int x = Integer.parseInt(scan.nextLine());
		
		int b[] = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			b[i] = Math.abs(a[i]-x);
		}
		
		
		int indexMax = 0;
		for(int i = 0; i < b.length; i++) {
			if(b[i] > b[indexMax]) {
				indexMax = i;
			}
		}
		
		System.out.println("Cac phan tu cach xa phan tu x = " + x + " la: ");
		for(int i = 0; i < b.length; i++) {
			if(b[i] == b[indexMax]) {
				System.out.println("(" + i + "," + a[i] +") \t");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMangForEach(a);
		lietKePTKhoangCachMax(a, scan);
	}

}
