/*
 * 目的：
 * 作成日：2021年4月08日
 * 作成人：トゥアン
 * バージョン： v.01
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
		System.out.print("名前： ");
		this.name = scan.nextLine();
		System.out.print("住所： ");
		this.address = scan.nextLine();
		System.out.print("番号：　");
		this.id = scan.nextLine();
		System.out.print("メール： ");
		this.email = scan.nextLine();
	}
	
	public void output() {
		System.out.print("番号：　" + this.id + "\t"
						+"名前： " + this.name + "\t" 
						+"住所： " + this.address + "\t"
						+"メール： " + this.email);
	}
	// 5. Business methods

	

}
