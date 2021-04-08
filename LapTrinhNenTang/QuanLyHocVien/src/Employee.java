/*
 * �ړI�F
 * �쐬���F2021�N4��08��
 * �쐬�l�F�g�D�A��
 * �o�[�W�����F v.01
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
		System.out.print("�A�Ɠ���: ");
		this.workDay = Float.parseFloat(scan.nextLine());
		System.out.print("����: ");
		this.dailySalary = Float.parseFloat(scan.nextLine());
	}
	
	@Override
	public void output() {
		super.output();
		System.out.println("\t" + "�A�Ɠ�: " + this.workDay + "\t" + "����: " + this.name);
	}
	
	//5. Business methods
	

}
