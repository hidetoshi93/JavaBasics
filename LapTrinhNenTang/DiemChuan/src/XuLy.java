import java.util.Scanner;

public class XuLy {

	final static float KHONG_KHU_VUC = 0f;
	final static float DIEM_KHU_VUC_A = 2f;
	final static float DIEM_KHU_VUC_B = 1f;
	final static float DIEM_KHU_VUC_C = 0.5f;

	final static float DIEM_DOI_TUONG_0 = 0f;
	final static float DIEM_DOI_TUONG_1 = 2.5f;
	final static float DIEM_DOI_TUONG_2 = 1.5f;
	final static float DIEM_DOI_TUONG_3 = 1f;

	static boolean flag = true;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static char chonKhuVuc(Scanner scan) {

		System.out.println("Vui long nhap ten khu vuc uu tien:");
		System.out.println("A. Khu vuc A");
		System.out.println("B. Khu vuc B");
		System.out.println("C. Khu vuc C");
		System.out.println("X. Khong thuoc khu vuc uu tien");

		char khuVuc = scan.next().charAt(0);

		return khuVuc;
	}

	public static int chonDoiTuong(Scanner scan) {

		System.out.println("Vui long nhap ten doi tuong uu tien:");
		System.out.println("0. Khong thuoc doi tuong uu tien");
		System.out.println("1. Doi tuong 1");
		System.out.println("2. Doi tuong 2");
		System.out.println("3. Doi tuong 3");

		int doiTuong = Integer.parseInt(scan.next());

		return doiTuong;
	}

	public static float nhapDiemThiMon(float diemThiMon) {
		float diem = 0;
		
		if (diemThiMon < 0 || diemThiMon > 10) {
			flag = false;
		} else {
			flag = true;
		}
		
		if (flag == true) {
			diem = diemThiMon;
		} else {
			System.out.println("Diem thi mon phai la so tu 0 den 10");
		}
		
		return diem;
	}
	

	public static float tinhDiem3Mon(Scanner scan) {
		float tongDiemThi3Mon = 0;

		System.out.println("Vui long nhap diem thi");

		System.out.println("Diem thi mon thu nhat :");
		float diemMon1 = Float.parseFloat(scan.next());
		diemMon1 = nhapDiemThiMon(diemMon1);
		
		System.out.println("Diem thi mon thu hai :");
		float diemMon2 = Float.parseFloat(scan.next());
		diemMon2 = nhapDiemThiMon(diemMon1);

		System.out.println("Diem thi mon thu ba :");
		float diemMon3 = Float.parseFloat(scan.next());
		diemMon3 = nhapDiemThiMon(diemMon1);

		tongDiemThi3Mon = diemMon1 + diemMon2 + diemMon3;

		return tongDiemThi3Mon;
	}

	public static float nhapDiemChuan(Scanner scan) {
		System.out.println("Vui long nhap diem chuan :");
		float diemChuan = Float.parseFloat(scan.next());

		return diemChuan;
	}

	public static float tinhDiemKhuVuc(char khuVuc) {
		float diem = 0;
		if (khuVuc == 'X') {
			diem = KHONG_KHU_VUC;
		} else if (khuVuc == 'A') {
			diem = DIEM_KHU_VUC_A;
		} else if (khuVuc == 'B') {
			diem = DIEM_KHU_VUC_B;
		} else if (khuVuc == 'C') {
			diem = DIEM_KHU_VUC_C;
		}

		return diem;
	}

	public static float tinhDiemDoiTuong(int doiTuong) {
		float diem = 0;
		if (doiTuong == 0) {
			diem = DIEM_DOI_TUONG_0;
		} else if (doiTuong == 1) {
			diem = DIEM_DOI_TUONG_1;
		} else if (doiTuong == 2) {
			diem = DIEM_DOI_TUONG_2;
		} else if (doiTuong == 3) {
			diem = DIEM_DOI_TUONG_3;
		}

		return diem;
	}

	public static float tinhTongDiem(char khuVuc, int doiTuong, Scanner scan) {

		float diemKhuVuc = tinhDiemKhuVuc(khuVuc);
		float diemDoiTuong = tinhDiemDoiTuong(doiTuong);
		float diemThi = tinhDiem3Mon(scan);

		float tongDiem = diemDoiTuong + diemKhuVuc + diemThi;

		return tongDiem;
	}

	public static void xetDoTruot(float tongDiem, float diemChuan) {
		if (tongDiem >= diemChuan) {
			System.out.println("Chuc mung ban vuot qua ki thi !");
		} else {
			System.out.println("That dang tiec ban khong vuot qua ki thi !");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		char khuVuc = chonKhuVuc(scan);
		int doiTuong = chonDoiTuong(scan);
		float tongDiem3Mon = tinhDiem3Mon(scan);
		float tongDiem = tinhTongDiem(khuVuc, doiTuong, scan);
		float diemChuan = nhapDiemChuan(scan);
		xetDoTruot(tongDiem3Mon, diemChuan);
	}
}
