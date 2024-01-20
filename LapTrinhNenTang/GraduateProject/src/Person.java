import java.util.Scanner;

/*
 * 作成人：
 * 作成日：
 * 目的：　親クラスの作業管理
 * バージョン：
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
//		System.out.println("============== 人事追加 ==============");
		System.out.print("社員番号: ");
		this.id = scan.nextLine();
		
		System.out.print("名前： ");
		this.name = scan.nextLine();
		
		System.out.print("電話番号： ");
		this.phoneNumber = scan.nextLine();
		
		System.out.print("出勤日： ");
		this.workDay = Float.parseFloat(scan.nextLine());
		
		System.out.println("================ 終了 ================");
	}
	
	public void output() {
		System.out.print("社員番号: " + this.id);
		System.out.print("\t 名前： " + this.name);
		System.out.print("\t 電話番号： " + this.phoneNumber);
		System.out.print("\t 出勤日： " + this.workDay);
	}
	
	//5. Business methods
	public void salaryCalculate() {
		this.salary = 0;
	}
	
	public void showIDAndName() {
		System.out.println("ID: " + this.id + "\t 名前: " + this.name);
	}


}
