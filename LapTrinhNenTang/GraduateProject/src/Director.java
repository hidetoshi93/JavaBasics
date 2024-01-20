/*
 * 作成人：
 * 作成日：
 * 目的：　親クラスの作業管理
 * バージョン：
 * 
 */
public class Director extends Person {
	//Constants
	final int DAILY_SALARY = 200;
	final int TREATMENT_DIRECTOR = 100;
	
	// 1. Attributes
	private int subordinatesNumber;
	// 2. Get, set methods
	
	public int getSubordinatesNumber() {
		return subordinatesNumber;
	}

	public void setSubordinatesNumber(int subordinatesNumber) {
		this.subordinatesNumber = subordinatesNumber;
	}

	// 3. Constructor methods
	
	public Director() {
		this.subordinatesNumber = 0;
	}

	/**
	 * @param id
	 * @param name
	 * @param phoneNumber
	 * @param workDay
	 */
	public Director(String id, String name, String phoneNumber, float workDay) {
		super(id, name, phoneNumber, workDay);
		this.subordinatesNumber = 0;
	}
	// 4. Input, output methods
	@Override
	public void output() {
		super.output();
		System.out.println("\t 部下数: " + this.subordinatesNumber + "\t 給料: " + this.salary);
	}
	// 5. Business methods
	
	@Override
	public void salaryCalculate() {
		this.salary = this.workDay * DAILY_SALARY + this.subordinatesNumber * TREATMENT_DIRECTOR;
	}
	
	public void add() {
		this.subordinatesNumber++;
	}
	
	public void delete() {
		this.subordinatesNumber--;
	}

}
