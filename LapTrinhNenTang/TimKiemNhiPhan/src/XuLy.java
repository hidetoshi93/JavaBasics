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
		System.out.println("Xuat mang ");
		for (int item : a) {
			System.out.print(item + "\t");
		}			
	}
	
	public static int binarySearch(int a[], int x) {
		int left = 0;
		int right = a.length -1;
		int mid;
		
		do {
			mid = (left + right)/2;
			
			if(x == a[mid]) {
				return mid;
			} else if (a[mid] < x) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		} while (left <= right);
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap so phan tu n = ");
		int n = Integer.parseInt(scan.nextLine());
		
		int a[] = nhapMang(n, scan);
		
		xuatMangForEach(a);
		
		System.out.print("\nNhap vao phan tu can tim kiem x = ");
		int x = Integer.parseInt(scan.nextLine());
		int found = binarySearch(a, x);
		
		if(found != -1) {
			System.out.println("Tim thay x = " + x + " trong mang tai vi tri "+ found);
		}else {
			System.out.println("Khong tim thay x = " + x + "trong mang");
		}
	}

}