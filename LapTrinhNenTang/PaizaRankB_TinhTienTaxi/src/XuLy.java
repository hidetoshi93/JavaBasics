import java.util.Scanner;


public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static int tinhTien(int quangDuongDauTien, int giaTienDauTien, int quangDuongThem, int giaTienThem,
			int tongDuongDi) {
		int tongTien = 0;
		if (tongDuongDi < quangDuongDauTien) {
			tongTien = giaTienDauTien;
		} else {
			tongTien = giaTienDauTien + ((tongDuongDi - quangDuongDauTien) / quangDuongThem + 1) * giaTienThem;
		}
		return tongTien;
	}

	public static void main(String[] args) {
		int tongTien = 0;
		int tongTienMax = 0;
		int tongTienMin = 0;
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String[] values = line.split("\\s");
		int N = Integer.parseInt(values[0]);
		int tongDuongDi = Integer.parseInt(values[1]);
//		int N = scan.nextInt();
//		int tongDuongDi = scan.nextInt();
		if (N >= 2 && N <= 100) {
			for (int i = 0; i < N; i++) {
				String[] taxiInfo = scan.nextLine().split("\\s");
				
				int quangDuongDauTien = Integer.parseInt(taxiInfo[0]);
				int giaTienDauTien = Integer.parseInt(taxiInfo[1]);
				int quangDuongThem = Integer.parseInt(taxiInfo[2]);
				int giaTienThem = Integer.parseInt(taxiInfo[3]);
				
				tongTien = tinhTien(quangDuongDauTien, giaTienDauTien, quangDuongThem, giaTienThem, tongDuongDi);
				
				//cach 1
				if(i == 0) {
					tongTienMin = tongTien;
					tongTienMax = tongTien;
				}
				if(tongTien < tongTienMin) {
					tongTienMin = tongTien;
				} else if(tongTien > tongTienMax) {
					tongTienMax = tongTien;
				}
				
				
				//cach 2
//				if (tongTienMin == 0) {
//	                tongTienMin = tongTien;
//	            } else if (tongTienMin > tongTien) {
//	                tongTienMin = tongTien;
//	            }
//	            
//	            
//	            if (tongTienMax == 0) {
//	                tongTienMax = tongTien;
//	            } else if (tongTienMax < tongTien) {
//	                tongTienMax = tongTien;
//	            }
			}
			System.out.print(tongTienMin+" "+tongTienMax);
		}
	}
}
