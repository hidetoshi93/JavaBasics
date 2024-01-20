/*
 * �쐬�l�F
 * �쐬���F
 * �ړI�F�@�e�N���X�̍�ƊǗ�
 * �o�[�W�����F
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
		this.director = null;  //���z��
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
			System.out.println("\t ����: " + this.salary +
					"\t ���� ID: " + this.director.getId() +
					"\t ����: " + this.director.getName());
		}else {
			System.out.println("\t ����: " + this.salary + "\t �z������Ă��Ȃ�");
		}
		
	}
	// 5. Business methods
	@Override
	public void salaryCalculate() {
		this.salary = this.workDay * DAILY_SALARY;
	}

}
