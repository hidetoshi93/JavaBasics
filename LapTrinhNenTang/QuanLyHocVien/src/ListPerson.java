/*
 * 目的：
 * 作成日：2021年4月08日
 * 作成人：トゥアン
 * バージョン： v.01
 */
import java.util.ArrayList;
import java.util.Collections;
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
	public void dummyData() {
		Person person;
		person = new Student("Hidetoshi", "Fukui", "01", "Hidetoshi@gmail.com", 8, 9, 10);
		this.listPerson.add(person);
		
		person = new Student("Hanako", "Sakai", "02", "Hanako@gmail.com", 8, 9, 10);
		this.listPerson.add(person);
		
		person = new Student("Maiko", "Maruoka", "03", "Maiko@gmail.com", 8, 9, 10);
		this.listPerson.add(person);
		
		person = new Employee("Fujitora", "Onepiece", "04", "Fujitora@gmail.com", 15, 20);
		this.listPerson.add(person);
		
		person = new Employee("Akainu", "Onepice", "05", "Akainu@gmail.com", 15, 20);
		this.listPerson.add(person);
		
		person = new Employee("Aokiji", "Onepice", "06", "Aokiji@gmail.com", 15, 20);
		this.listPerson.add(person);
		
		person = new Customer("Luffy", "EastBlue", "07", "Luffy@onepiece.com", "D族", 20, "Good");
		this.listPerson.add(person);
		
		person = new Customer("Garp", "EastBlue", "08", "Garp@onepiece.com", "D族", 20, "VeryGood");
		this.listPerson.add(person);
		
	}
	
	private void interchangeSort(ArrayList<Person> _list) {
		int i;
		int j;
		for(i = 0; i < _list.size()-1; i++) {
			for(j = i+1; j < _list.size()-1; j++) {
				Person personI = _list.get(i);
				Person personJ = _list.get(j);
				if(personJ.getName().compareToIgnoreCase(personI.getName()) < 0) {
					Collections.swap(_list, i, j);
				}
			}
		}
	}
	
	public void sortName() {
		interchangeSort(this.listPerson);
	}
	

}
