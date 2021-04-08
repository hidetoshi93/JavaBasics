/*
 * 目的：
 * 作成日：2021年4月08日
 * 作成人：トゥアン
 * バージョン： v.01
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
		System.out.print("会社名: ");
		this.company = scan.nextLine();
		System.out.print("取引金額: ");
		this.transactionAmount = Float.parseFloat(scan.nextLine());
		System.out.print("評価: ");
		this.company = scan.nextLine();
	}
	
	@Override
	public void output() {
		super.output();
		System.out.println("\t" + "会社名: " + this.company + "\t" + "取引金額: " + this.transactionAmount + "評価: " + this.evaluation);
	}
	//5. Business methods
	

}
