

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 作成人：
 * 作成日：
 * 目的：　親クラスの作業管理
 * バージョン：
 * 
 */
public class PersonList {
	//1. Attributes
	private ArrayList<Person> personList;
	
	//2. Get,set methods
	
	/**
	 * @return the personList
	 */
	public ArrayList<Person> getPersonList() {
		return personList;
	}

	/**
	 * @param personList the personList to set
	 */
	public void setPersonList(ArrayList<Person> personList) {
		this.personList = personList;
	}
	
	//3. Constructor methods
	public PersonList() {
		this.personList = new ArrayList<Person>();
	}
	
	//4. Input, output methods
	private void printMenu() {
		System.out.println("1. 平社員入力");
		System.out.println("2. 部長入力");
		System.out.println("3. 社長入力");
		System.out.println("0. もどる");
	}
	
	public ArrayList<Employee> input(Scanner scan) {
		boolean flag = true;
		ArrayList<Employee> newEmployeeList = new ArrayList<Employee>();
		Person person = null;
		
		do {
			printMenu();
			System.out.println("入力選択してください");
			int selected = Integer.parseInt(scan.nextLine());
			switch(selected) {
			case 0:
				flag = false;
				break;
			case 1:
				person = new Employee();
				person.input(scan);
				person.salaryCalculate();
				this.add(person);
				newEmployeeList.add((Employee)person);
				break;
			case 2:
				person = new Director();
				person.input(scan);
				person.salaryCalculate();
				this.add(person);
				break;
			case 3:
				person = new President();
				person.input(scan);
				person.salaryCalculate();
				this.add(person);
				break;
			default:
				System.out.println("0～3の数字を入力してください");	
			}
		}while(flag);
		
		return newEmployeeList;
	}
	
	public void output() {
		for(Person person:this.personList) {
			person.output();
		}
	}
	
	public void salaryCalculate() {
		for(Person person:this.personList) {
			person.salaryCalculate();
		}
	}
	
	public void add(Person person) {
		this.personList.add(person);
	}

}
