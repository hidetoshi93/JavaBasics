
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
		System.out.println();
		System.out.println("Xuat mang ");
		for (int item : a) {
			System.out.print(item + "\t");
		}
	}

	public static int[] interChangeSort(int a[]) {
		int i;
		int j;
		for (i = 0; i < a.length - 1; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int tam = a[i];
					a[i] = a[j];
					a[j] = tam;
				}
			}
		}
		return a;
	}
	
	public static int[] bubbleSort(int a[]) {
		int i;
		int j;
		for (i = 0; i < a.length - 1; i++) {
			for (j = a.length - 1; j > i; j--) {
				if (a[j] < a[j-1]) {
					int tam = a[j];
					a[j] = a[j-1];
					a[j-1] = tam;
				}
			}
		}
		return a;
	}
	
	
	public static int timMin(int a[], int k) {
		int vtmin = k;
		for (int i = k; i < a.length; i++) {
			if (a[i] < a[vtmin]) {
				vtmin = i;
			}
		}
		return vtmin;
	}
	
	public static int[] selectionSort(int a[]) {
		int  vtmin;
		for (int i = 0; i < a.length-1; i++) {
			vtmin = timMin(a, i);
			int tam = a[i];
			a[i] = a[vtmin];
			a[vtmin] = tam;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMangForEach(a);
//		interChangeSort(a);
//		xuatMangForEach(a);
		
//		bubbleSort(a);
//		xuatMangForEach(a);
		
		selectionSort(a);
		xuatMangForEach(a);
	
	}

}