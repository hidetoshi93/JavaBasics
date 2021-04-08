/*
 * 目的：
 * 作成日：2021年4月08日
 * 作成人：トゥアン
 * バージョン： v.01
 */
import java.util.ArrayList;
import java.util.Scanner;


public class ListPerson {
	//1. Attributes
	private ArrayList<Person> listPerson;
	
	//2. Get, set methods
	public ArrayList<Person> getListPerson() {
		return listPerson;
	}

	public void setListPerson(ArrayList<Person> listPerson) {
		this.listPerson = listPerson;
	}
	
	//3. Constructor
	public ListPerson() {
		listPerson = new ArrayList<Person>();
	}
	
	//4. Input,output methods
	private void printMenu() {
		System.out.println("次の対象を選んでください");
		System.out.println("1. 学生");
		System.out.println("2. 従業員");
		System.out.println("3.　顧客");
		System.out.println("0.　戻る");
	}
	public void input(Scanner scan) {
		boolean flag = true;
		do {
//			System.out.println("次の操作を選んでください");
			printMenu();
			int selected = Integer.parseInt(scan.nextLine());
			Person person;
			switch(selected) {
			case 1: 
				person = new Student();
				person.input(scan);
				listPerson.add(person);
				break;
			case 2:
				person = new Employee();
				person.input(scan);
				listPerson.add(person);
				break;
			case 3:
				person = new Customer();
				person.input(scan);
				listPerson.add(person);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.print("0～3の整数を選んでください");	
			}
		}while(flag);
	}
	
	public void output() {
		for(Person person: this.listPerson) {
			person.output();
		}
	}
	//5. Business methods
	

}
