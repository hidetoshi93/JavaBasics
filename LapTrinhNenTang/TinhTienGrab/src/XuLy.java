import java.util.Scanner;

public class XuLy {
	static final int GRAB_CAR_1KM = 8000;
	static final int GRAB_SUB_1KM = 9000;
	static final int GRAB_BLACK_1KM = 10000;

	static final int GRAB_CAR_1TO_19 = 7500;
	static final int GRAB_SUB_1TO_19 = 8500;
	static final int GRAB_BLACK_1TO_19 = 9500;

	static final int GRAB_CAR_UPPER_19 = 7000;
	static final int GRAB_SUB_UPPER_19 = 8000;
	static final int GRAB_BLACK_UPPER_19 = 9000;

	static final int GRAB_CAR_WAIT = 2000;
	static final int GRAB_SUB_WAIT = 3000;
	static final int GRAB_BLACK_WAIT = 3500;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static int chonLoaiGrab(Scanner scan) {
		int loaiGrab = 0;
		System.out.print("Vui long chon loai grab: ");
		System.out.println("1. Grab Car");
		System.out.println("2. Grab SUV");
		System.out.println("3. Grab Black");
		loaiGrab = Integer.parseInt(scan.next());

		return loaiGrab;
	}

	public static float tinhTienKMDauTien(int loaiGrab) {
		float tien = 0;

		if (loaiGrab == 1) {
			tien = GRAB_CAR_1KM;
		} else if (loaiGrab == 2) {
			tien = GRAB_SUB_1KM;
		} else if (loaiGrab == 3) {
			tien = GRAB_BLACK_1KM;
		}

		return tien;
	}

	public static float tinhTienKM1Den19(int loaiGrab, float soKM) {
		float tien = 0;

		if (loaiGrab == 1) {
			tien = GRAB_CAR_1KM + (soKM - 1) * GRAB_CAR_1TO_19;
		} else if (loaiGrab == 2) {
			tien = GRAB_SUB_1KM + (soKM - 1) * GRAB_SUB_1TO_19;
		} else if (loaiGrab == 3) {
			tien = GRAB_BLACK_1KM + (soKM - 1) * GRAB_BLACK_1TO_19;
		}

		return tien;
	}

	public static float tinhTienKM20TroLen(int loaiGrab, int soKM) {
		float tien = 0;

		if (loaiGrab == 1) {
			tien = GRAB_CAR_1KM + 18 * GRAB_CAR_1TO_19 + (soKM - 1) * GRAB_CAR_UPPER_19;
		} else if (loaiGrab == 2) {
			tien = GRAB_SUB_1KM + 18 * GRAB_SUB_1TO_19 + (soKM - 1) * GRAB_SUB_UPPER_19;
		} else if (loaiGrab == 3) {
			tien = GRAB_BLACK_1KM + 18 * GRAB_BLACK_1TO_19 + (soKM - 1) * GRAB_BLACK_UPPER_19;
		}

		return tien;
	}

	public static float tinhTienCho(int loaiGrab, int thoiGianCho) {
		float tien = 0;

		if (thoiGianCho >= 3) {
			int soLanTinh = Math.round((thoiGianCho * 1.0f) / 3);

			if (loaiGrab == 1) {
				tien = soLanTinh * GRAB_CAR_WAIT;
			} else if (loaiGrab == 2) {
				tien = soLanTinh * GRAB_SUB_WAIT;
			} else if (loaiGrab == 3) {
				tien = soLanTinh * GRAB_BLACK_WAIT;
			}
		}

		return tien;
	}

	public static float tinhTienTra(int loaiGrab, float soKM, int thoiGianCho) {
		float tienTra = 0;

		if (soKM <= 1) {
			tienTra = tinhTienKMDauTien(loaiGrab) + tinhTienCho(loaiGrab, thoiGianCho);
		} else if (soKM > 1 && soKM < 19) {
			tienTra = tinhTienKM1Den19(loaiGrab, soKM) + tinhTienCho(loaiGrab, thoiGianCho);
		} else if (soKM >= 19) {
			tienTra = tinhTienKM20TroLen(loaiGrab, thoiGianCho) + tinhTienCho(loaiGrab, thoiGianCho);
		}

		return tienTra;
	}

	public static float nhapSoKM(Scanner scan) {
		float soKM = 0;
		System.out.println("Vui long nhap so km: ");
		soKM = Float.parseFloat(scan.nextLine());
		return soKM;
	}

	public static int nhapThoiGianCho(Scanner scan) {
		int thoiGianCho = 0;
		System.out.println("Vui long nhap thoi gian cho: ");
		thoiGianCho = Integer.parseInt(scan.nextLine());
		return thoiGianCho;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int loaiGrab = chonLoaiGrab(scan);
		float soKM = nhapSoKM(scan);
		int thoiGianCho = nhapThoiGianCho(scan);
		float tienTra = tinhTienTra(loaiGrab, soKM, thoiGianCho);
		System.out.println("So tien phai tra la: " + tienTra);
	}

}
