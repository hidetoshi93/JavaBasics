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
	
	public static void lietKeDongPTChan(int a[][], int soDong, int soCot)
	{
		boolean flag = false;
		for(int i = 0; i < soDong; i++) {
			flag = false;
			for(int j = 0; j < soCot; j++) {
				if(a[i][j] % 2 ==0) {
					flag = true;
					break;
				}
			}
			if(flag) {
				System.out.println("Dong " + i + " co chua phan tu chan");
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
		lietKeDongPTChan(a, soDong, soCot);
	}

}