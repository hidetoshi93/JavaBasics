/*
 * �쐬�l�F
 * �쐬���F
 * �ړI�F�@�e�N���X�̍�ƊǗ�
 * �o�[�W�����F
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
		System.out.println("\t ������: " + this.subordinatesNumber + "\t ����: " + this.salary);
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
