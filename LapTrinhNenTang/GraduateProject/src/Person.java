import java.util.Scanner;

/*
 * �쐬�l�F
 * �쐬���F
 * �ړI�F�@�e�N���X�̍�ƊǗ�
 * �o�[�W�����F
 * 
 */
public class Person {
	//1. Attributes
	protected String id;
	protected String name;
	protected String phoneNumber;
	protected float workDay;
	protected float salary;
	//2. Get, set methods
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public float getWorkDay() {
		return workDay;
	}

	public void setWorkDay(float workDay) {
		this.workDay = workDay;
	}
	
	public float getSalary() {
		return salary;
	}
	//3. Constructor methods
	public Person() {
		
	}

	public Person(String id, String name, String phoneNumber, float workDay) {
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.workDay = workDay;
	}
	//4. Input, output methods
	public void input(Scanner scan) {
//		System.out.println("============== �l���ǉ� ==============");
		System.out.print("�Ј��ԍ�: ");
		this.id = scan.nextLine();
		
		System.out.print("���O�F ");
		this.name = scan.nextLine();
		
		System.out.print("�d�b�ԍ��F ");
		this.phoneNumber = scan.nextLine();
		
		System.out.print("�o�Γ��F ");
		this.workDay = Float.parseFloat(scan.nextLine());
		
		System.out.println("================ �I�� ================");
	}
	
	public void output() {
		System.out.print("�Ј��ԍ�: " + this.id);
		System.out.print("\t ���O�F " + this.name);
		System.out.print("\t �d�b�ԍ��F " + this.phoneNumber);
		System.out.print("\t �o�Γ��F " + this.workDay);
	}
	
	//5. Business methods
	public void salaryCalculate() {
		this.salary = 0;
	}
	
	public void showIDAndName() {
		System.out.println("ID: " + this.id + "\t ���O: " + this.name);
	}


}
