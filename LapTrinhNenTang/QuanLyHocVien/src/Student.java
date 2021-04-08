import java.util.Scanner;

/*
 * 目的：
 * 作成日：2021年4月08日
 * 作成人：トゥアン
 * バージョン： v.01
 */
public class Student extends Person {
	// 1. Attributes
	private float math;
	private float physics;
	private float chemistry;

	// 2. Get, set methods
	public float getMath() {
		return math;
	}

	public void setMath(float math) {
		this.math = math;
	}

	public float getPhysics() {
		return physics;
	}

	public void setPhysics(float physics) {
		this.physics = physics;
	}

	public float getChemistry() {
		return chemistry;
	}

	public void setChemistry(float chemistry) {
		this.chemistry = chemistry;
	}

	// 3. Constructor
	public Student() {

	}

	public Student(float math, float physics, float chemistry) {
		super();
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;
	}
	
	public Student(String name, String address, String id, String email,float math, float physics, float chemistry) {
		super(name, address, id, email);
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;
	}

	// 4. Input, output methods
	@Override
	public void input(Scanner scan) {
		super.input(scan);
		System.out.print("数学: ");
		this.math = Float.parseFloat(scan.nextLine());
		System.out.print("物理: ");
		this.physics = Float.parseFloat(scan.nextLine());
		System.out.print("化学: ");
		this.chemistry = Float.parseFloat(scan.nextLine());
	}
	
	@Override
	public void output() {
		super.output();
		System.out.println("\t" + "数学: " + this.math + "\t" + "物理: " + this.name + "\t" + "化学: " + this.address);
	}
	// 5. Business methods

}
