import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float INTEREST = 0.015f;
		float penalty = 0;
		
		Scanner creditCard = new Scanner(System.in);
		
		System.out.print("Vui long nhap so du trong the tin dung : ");
		float creditCardBalance = Float.parseFloat(creditCard.nextLine());
		
		System.out.print("Vui long so tien phai tra trong thang : ");
		float payment = Float.parseFloat(creditCard.nextLine());
		
		float banlance = creditCardBalance - payment;
		
		if (banlance > 0) {
			penalty = banlance * INTEREST;
		}
		System.out.println("Tien phat phai tra la : " + penalty);
		
	}

}
