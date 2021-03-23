import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhap vao gia tri lon hon 1");
			n = Integer.parseInt(scan.nextLine());
		}while (n < 1);
		return n;
	}
	
	public static int[][] nhapMang(int soDong, int soCot, Scanner scan){
		int a[][] = new int[soDong][soCot];
		
		for (int i = 0; i < soDong; i++) {
			for(int j = 0; j < soCot; j++) {
				System.out.print("a["+ i + "]" + "[" + j + "] = ");
				a[i][j] = Integer.parseInt(scan.nextLine());
			}
		}
		return a;
	}
	
	public static void xuatMang(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for(int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
	
	public static int tongPhanTu(int a[][], int soDong, int soCot) {
		int tong = 0;
		for (int i = 0; i < soDong; i++) {
			for(int j = 0; j < soCot; j++) {
				tong += a[i][j];
			}
		}
		
		return tong;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soDong = nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] = nhapMang(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);
		int tong = tongPhanTu(a, soDong, soCot);
		System.out.println("Tong cac phan tu trong ma tran 2 chieu la: " + tong);
	}

}
