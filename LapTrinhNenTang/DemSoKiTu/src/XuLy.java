import java.util.Scanner;

public class XuLy {

	final static int KC_0 = 12;
	final static int KC_1 = 3;
	final static int KC_2 = 4;
	final static int KC_3 = 5;
	final static int KC_4 = 6;
	final static int KC_5 = 7;
	final static int KC_6 = 8;
	final static int KC_7 = 9;
	final static int KC_8 = 10;
	final static int KC_9 = 11;

	public static void main(String[] args) {
		int giaTri = 0;
		System.out.println("Nhap so n: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("Chuoi la: " + str);
		int array[] = new int[str.length()];
		for(int i=0; i<str.length();i++) {
			array[i] = str.charAt(i) - '0';
			System.out.println(array[i]);
			if(array[i] == 0) {
				array[i] = KC_0;
			}
			else if(array[i] == 1) {
				array[i] = KC_1;
			}
			else if(array[i] == 2) {
				array[i] = KC_2;
			}
			else if(array[i] == 3) {
				array[i] = KC_3;
			}
			else if(array[i] == 4) {
				array[i] = KC_4;
			}
			else if(array[i] == 5) {
				array[i] = KC_5;
			}
			else if(array[i] == 6) {
				array[i] = KC_6;
			}
			else if(array[i] == 7) {
				array[i] = KC_7;
			}
			else if(array[i] == 8) {
				array[i] = KC_8;
			}
			else if(array[i] == 9) {
				array[i] = KC_9;
			}
			else{
				array[i] = 0;
			}
			giaTri += array[i];
		}
		System.out.println(2*giaTri);
	}
}
