/*
 * 作成人：
 * 作成日：
 * 目的：　親クラスの作業管理
 * バージョン：
 * 
 */
public class Employee extends Person {
	// Constant
	final int DAILY_SALARY = 100;
	
	// 1. Attributes
	private Director director;
	
	// 2. Get, set methods
	
	/**
	 * @return the director
	 */
	public Director getDirector() {
		return director;
	}

	/**
	 * @param director the director to set
	 */
	public void setDirector(Director director) {
		this.director = director;
	}

	// 3. Constructor methods
	public Employee() {
		this.director = null;  //未配属
	}

	/**
	 * @param id
	 * @param name
	 * @param phoneNumber
	 * @param workDay
	 */
	public Employee(String id, String name, String phoneNumber, float workDay) {
		super(id, name, phoneNumber, workDay);
		
	}
	
	// 4. Input, output methods
	@Override
	public void output() {
		super.output();
		if(this.director != null) {
			System.out.println("\t 給料: " + this.salary +
					"\t 部長 ID: " + this.director.getId() +
					"\t 部長: " + this.director.getName());
		}else {
			System.out.println("\t 給料: " + this.salary + "\t 配属されていない");
		}
		
	}
	// 5. Business methods
	@Override
	public void salaryCalculate() {
		this.salary = this.workDay * DAILY_SALARY;
	}

}
