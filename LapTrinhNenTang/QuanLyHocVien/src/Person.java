/*
 * �ړI�F
 * �쐬���F2021�N4��08��
 * �쐬�l�F�g�D�A��
 * �o�[�W�����F v.01
 */

import java.util.Scanner;

public class Person {
	// 1.Attributes
	protected String name;
	protected String address;
	protected String id;
	protected String email;

	// 2.Get,set methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// 3. Constructors
	public Person() {
		
	}

	public Person(String name, String address, String id, String email) {
		this.name = name;
		this.address = address;
		this.id = id;
		this.email = email;
	}
	
	// 4. Input, output methods
	public void input(Scanner scan) {
		System.out.print("���O�F ");
		this.name = scan.nextLine();
		System.out.print("�Z���F ");
		this.address = scan.nextLine();
		System.out.print("�ԍ��F�@");
		this.id = scan.nextLine();
		System.out.print("���[���F ");
		this.email = scan.nextLine();
	}
	
	public void output() {
		System.out.print("�ԍ��F�@" + this.id + "\t"
						+"���O�F " + this.name + "\t" 
						+"�Z���F " + this.address + "\t"
						+"���[���F " + this.email);
	}
	// 5. Business methods

	

}
