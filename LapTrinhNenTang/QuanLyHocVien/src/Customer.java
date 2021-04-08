/*
 * �ړI�F
 * �쐬���F2021�N4��08��
 * �쐬�l�F�g�D�A��
 * �o�[�W�����F v.01
 */
import java.util.Scanner;

public class Customer extends Person {
	//1. Attributes
	private String company;
	private float transactionAmount;
	private String evaluation;
	
	//2. Get,set methods
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public float getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}

	//3. Constructor
	public Customer() {
		
	}

	public Customer(String company, float transactionAmount, String evaluation) {
		super();
		this.company = company;
		this.transactionAmount = transactionAmount;
		this.evaluation = evaluation;
	}
	
	public Customer(String name, String address, String id, String email,String company, float transactionAmount, String evaluation) {
		super(name, address, id, email);
		this.company = company;
		this.transactionAmount = transactionAmount;
		this.evaluation = evaluation;
	}
	
	//4. Input, output methods
	@Override
	public void input(Scanner scan) {
		super.input(scan);
		System.out.print("��Ж�: ");
		this.company = scan.nextLine();
		System.out.print("������z: ");
		this.transactionAmount = Float.parseFloat(scan.nextLine());
		System.out.print("�]��: ");
		this.company = scan.nextLine();
	}
	
	@Override
	public void output() {
		super.output();
		System.out.println("\t" + "��Ж�: " + this.company + "\t" + "������z: " + this.transactionAmount + "�]��: " + this.evaluation);
	}
	//5. Business methods
	

}
