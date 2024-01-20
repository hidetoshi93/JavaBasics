import java.util.Scanner;

/*
 * �쐬�l�F
 * �쐬���F
 * �ړI�F�@�e�N���X�̍�ƊǗ�
 * �o�[�W�����F
 * 
 */
public class President extends Person {
	// Constant
	final int DAILY_SALARY = 300;
	
	// 1. Attributes
	private float stockNumber;
	
	// 2. Get, set methods
	/**
	 * @return the stockNumber
	 */
	public float getStockNumber() {
		return stockNumber;
	}

	/**
	 * @param stockNumber the stockNumber to set
	 */
	public void setStockNumber(float stockNumber) {
		this.stockNumber = stockNumber;
	}
	// 3. Constructor methods
	
	/**
	 * 
	 */
	public President() {
		
	}

	/**
	 * @param id
	 * @param name
	 * @param phoneNumber
	 * @param workDay
	 */
	public President(String id, String name, String phoneNumber, float workDay, float stockNumber) {
		super(id, name, phoneNumber, workDay);
		this.stockNumber = stockNumber;
	}
	
	// 4. Input, output methods
	@Override
	public void input(Scanner scan) {
		super.input(scan);
		System.out.println("����: ");
		this.stockNumber = Float.parseFloat(scan.nextLine());
	}
	
	@Override
	public void output() {
		super.output();
		System.out.println("\t�@����: " + this.salary);
	}
	
	// 5. Business methods
	public void salaryCalculate() {
		this.salary = this.workDay * DAILY_SALARY;
	}

}
