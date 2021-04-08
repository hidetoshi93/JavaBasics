/*
 * 目的：
 * 作成日：2021年4月08日
 * 作成人：トゥアン
 * バージョン： v.01
 */
import java.util.Scanner;

public class Employee extends Person {
	//1. Attributes
	private float workDay;
	private float dailySalary;

	//2. Get,set methods
	public float getWorkDay() {
		return workDay;
	}

	public void setWorkDay(float workDay) {
		this.workDay = workDay;
	}

	public float getDailySalary() {
		return dailySalary;
	}

	public void setDailySalary(float dailySalary) {
		this.dailySalary = dailySalary;
	}

	//3. Constructor
	public Employee() {
		
	}

	public Employee(String name, String address, String id, String email, float workDay, float dailySalary) {
		super(name, address, id, email);
		this.workDay = workDay;
		this.dailySalary = dailySalary;
	}

	public Employee(float workDay, float dailySalary) {
		super();
		this.workDay = workDay;
		this.dailySalary = dailySalary;
	}
	
	//4. Input, output methods
	@Override
	public void input(Scanner scan) {
		super.input(scan);
		System.out.print("就業日数: ");
		this.workDay = Float.parseFloat(scan.nextLine());
		System.out.print("日給: ");
		this.dailySalary = Float.parseFloat(scan.nextLine());
	}
	
	@Override
	public void output() {
		super.output();
		System.out.println("\t" + "就業日: " + this.workDay + "\t" + "日給: " + this.name);
	}
	
	//5. Business methods
	

}
