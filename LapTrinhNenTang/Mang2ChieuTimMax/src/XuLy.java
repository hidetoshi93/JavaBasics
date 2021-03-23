import java.util.Scanner;

public class XuLy {
	
	final static int MIN = -50;
	final static int MAX = 50;
	
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
				a[i][j] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
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
	
	public static void printMaxValue(int a[][], int soDong, int soCot ) {
		int dongMax = 0;
		int cotMax = 0;
		int max = a[dongMax][cotMax];
		
		for (int i = 0; i < soDong; i++) {
			
			for(int j = 0; j < soCot; j++) {
				if (a[i][j] > max) {
					dongMax = i;
					cotMax = j;
					max = a[dongMax][cotMax];
				}
			}
		}
		
		System.out.println("Gia tri max = " + max + " tai cac phan tu: ");
		for (int i = 0; i < soDong; i++) {
			for(int j = 0; j < soCot; j++) {
				if (a[i][j] == max) {
					System.out.print("(" + i + "," + j + ") \t");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soDong = nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] = nhapMang(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);
		printMaxValue(a, soDong, soCot);
	}

}
