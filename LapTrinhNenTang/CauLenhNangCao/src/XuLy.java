import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day;
		int month;
		int year;
		int dayOfWeek;
		int top;
		boolean flag = true;

		Scanner scan = new Scanner(System.in);

		System.out.print("Vui long nhap vao ngay");
		day = Integer.parseInt(scan.nextLine());

		System.out.print("Vui long nhap vao thang");
		month = Integer.parseInt(scan.nextLine());

		System.out.print("Vui long nhap vao nam");
		year = Integer.parseInt(scan.nextLine());

		if (year < 1582) {
			flag = false;
		}
		if (month < 1 || month > 12) {
			flag = false;
		}
		if (day < 1 || day > 31) {
			flag = false;
		}

		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			top = 30;
			break;
		case 2:
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				top = 29;
			} else {
				top = 28;
			}
			break;
		default:
			top = 31;
		}

		if (!flag) {
			System.out.println("Khong hop le");
		} else {
			int a = (14 - month) / 12;
			year -= a;
			month += 12 * a - 2;
			dayOfWeek = (day + year + year / 4 - year / 100 + year / 400 + (31 * month) / 12) % 7;
		}

	}

}
