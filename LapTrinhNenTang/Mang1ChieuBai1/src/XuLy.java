import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int[n];
		
		System.out.println("Nhap mang");
		
		for(int i = 0; i < n; i++) {
			System.out.println("a[" +i +"]");
			a[i] =Integer.parseInt(scan.nextLine());
		}
		
		return a;
	}
	
	public static void xuatMangForEach(int a[]) {
		System.out.println(" Xuat mang ");
		for (int item : a) {
			System.out.print(item + "\t");
		}			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhao so phan tu n = ");
		int n = Integer.parseInt(scan.nextLine());
		
		int a[] = nhapMang(n, scan);
		
		xuatMangForEach(a);
	}

}
