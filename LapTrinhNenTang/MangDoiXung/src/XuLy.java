import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int[n];
		
		System.out.println("Nhap mang");
		
		for(int i = 0; i < n; i++) {
			System.out.print("a[" +i +"] = ");
			a[i] =Integer.parseInt(scan.nextLine());
		}
		
		return a;
	}
	
	public static void xuatMangForEach(int a[]) {
//		System.out.println("\nXuat mang ");
		for (int item : a) {
			System.out.print(item + "\t");
		}
	}
	
	public static boolean isMangDoiXung(int a[]) {
		for(int i = 0; i < a.length/2 ; i++ ) {
			if(a[i] != a[a.length -1 -i]) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] mangXoayVong(int a[]) {
		int b[] = new int [a.length];
		for(int i = 0; i < a.length; i++) {
			if(i < a.length - 1) {
				b[i] = a[i + 1];
			} else {
				b[i] = a[0];
			}
		}
		a = b;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhao so phan tu n = ");
		int n = Integer.parseInt(scan.nextLine());
		
		int a[] = nhapMang(n, scan);
		
		boolean doixung = isMangDoiXung(a);
		
		if(doixung) {
			System.out.println("Mang doi xung");
		} else {
			System.out.println("Mang khong doi xung");
		}
		
		int soLan = 0;
		
		System.out.println("So lan dich trai xoay vong la: "+ soLan);
	}
}
