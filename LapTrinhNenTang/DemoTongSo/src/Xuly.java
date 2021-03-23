import java.util.Scanner;

public class Xuly {

	public Xuly() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		final String NUM_CHAR_PADDING_LEFT = "%-70s";
		// TODO Auto-generated method stub
		/**
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		int n;
		int unit;
		int ten;
		int hundred;
		int sum;
		Scanner nhap = new Scanner(System.in);
		System.out.print("Vui long nhap so : ");
		n = Integer.parseInt(nhap.nextLine());
		hundred = n/100;
		ten = (n%100/10);
		unit = n%10;
		sum = hundred + ten + unit;
		
		String text;
		
		text = String.format(NUM_CHAR_PADDING_LEFT, "Ten-phim:").replace(' ','.').replace('-',' ');
		System.out.println(text);
		
		System.out.println("Tong cua 3 chu so cua n = " + n + " la:" + sum);
	}


}
