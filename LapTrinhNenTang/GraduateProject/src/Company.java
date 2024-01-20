/*
 * 作成人：
 * 作成日：
 * 目的：　親クラスの作業管理
 * バージョン：
 * 
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Company {
	// 1. Attributes
	private String companyName;
	private String taxId;
	private float monthOfProceeds;
	private PersonList objPersonList;

	// 2. Get,set methods
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the taxId
	 */
	public String getTaxId() {
		return taxId;
	}

	/**
	 * @param taxId the taxId to set
	 */
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	/**
	 * @return the monthOfProceeds
	 */
	public float getMonthOfProceeds() {
		return monthOfProceeds;
	}

	/**
	 * @param monthOfProceeds the monthOfProceeds to set
	 */
	public void setMonthOfProceeds(float monthOfProceeds) {
		this.monthOfProceeds = monthOfProceeds;
	}

	/**
	 * @return the objPersonList
	 */
	public PersonList getObjPersonList() {
		return objPersonList;
	}

	/**
	 * @param objPersonList the objPersonList to set
	 */
	public void setObjPersonList(PersonList objPersonList) {
		this.objPersonList = objPersonList;
	}

	// 3. Constructor
	public Company() {
		this.objPersonList = new PersonList();
	}

	// 4. Input, output methods
	public void input(Scanner scan) {
		System.out.println("************会社情報入力****************");
		System.out.print("会社名: ");
		this.companyName = scan.nextLine();

		System.out.print("税理番号: ");
		this.taxId = scan.nextLine();

		System.out.print("売上: ");
		this.monthOfProceeds = Float.parseFloat(scan.nextLine());
	}

	public void output() {
		System.out.println(
				"**********************************************************会社情報**********************************************************");
		System.out.println("会社名: " + this.companyName);
		System.out.println("税理番号: " + this.taxId);
		System.out.println("売上: " + this.monthOfProceeds);
		System.out.println(
				"***************************************************************************************************************************");
		this.objPersonList.output();
	}

	// 5. Business methods
	public void salaryCalculate() {
		this.objPersonList.salaryCalculate();
	}

	public void dummyDataCompany() {
		this.companyName = "ジェー　エーム　アイ　株式会社";
		this.taxId = "JP999999ND";
		this.monthOfProceeds = 435344f;
	}

	public void dummyDataPerson() {
		Person person = new Person();
		person = new Employee("1", "三国連太郎", "098032", 20);
		objPersonList.add(person);
		person = new Employee("2", "吉幾三", "098132", 23);
		objPersonList.add(person);
		person = new Employee("3", "谷啓", "098232", 31);
		objPersonList.add(person);
		person = new Employee("4", "志村けん", "098332", 25);
		objPersonList.add(person);
		person = new Employee("5", "鹿間敏弘", "098432", 23);
		objPersonList.add(person);
		person = new Employee("6", "藤井哲", "098532", 31);
		objPersonList.add(person);

		person = new Director("7", "鈴木　部長", "0989898", 24);
		objPersonList.add(person);
		person = new Director("8", "青山　部長", "0989898", 24);
		objPersonList.add(person);
		person = new Director("9", "藤井　部長", "0989898", 24);
		objPersonList.add(person);

		person = new President("10", "豊田章夫　社長", "0989898", 19, 80);
		objPersonList.add(person);

		person = new President("11", "稲盛和夫　社長", "0989898", 21, 20);
		objPersonList.add(person);
	}

	public void assignEmployee() {
		for (Person person : objPersonList.getPersonList()) {
			if (person instanceof Employee) {
				Scanner scan = new Scanner(System.in);
				System.out.println("配属されている従業員");
				person.output();
				assignOnePerson(scan, person);
			}
		}
	}

	private void assignOnePerson(Scanner scan, Person person) {
		showIDAndNameDirector();
		boolean flag = true;
		do {
			System.out.println("配属する場合は 1 を、しない場合は 2 を選んでください");
			int selected = Integer.parseInt(scan.nextLine());
			if (selected == 1 || selected == 2) {
				if (selected == 1) {
					Director director = selectDirector(scan);
					((Employee) person).setDirector(director);
					director.add();
				}
				flag = false;
			} else {
				System.out.println("1又は2を選んでください");
				flag = false;
			}
		} while (flag);
	}

	private Director selectDirector(Scanner scan) {
		Director director = null;
		do {
			System.out.println("上記の部長IDを入力してください");
			String selectedID = scan.nextLine();
			director = searchDirector(selectedID);
		} while (director == null);

		return director;
	}

	private void showIDAndNameDirector() {
		System.out.println(
				"**********************************************************部長リスト**********************************************************");
		ArrayList<Director> list = getDirectorList();
		for (Director director : list) {
			director.showIDAndName();
		}
		System.out.println(
				"==========================================================================================================================");
	}

	public void directorList() {
		for (Person person : objPersonList.getPersonList()) {
			if (person instanceof Director) {
				person.showIDAndName();
			}
		}
	}

	public Director searchDirector(String id) {
		Director director = null;
		for (Person person : objPersonList.getPersonList()) {
			if (person instanceof Director) {
				if (person.getId().compareTo(id) == 0) {
					director = (Director) person;
				}
			}
		}
		return director;
	}

	public ArrayList<Director> getDirectorList() {
		ArrayList<Director> directorList = new ArrayList<Director>();
		for (Person person : objPersonList.getPersonList()) {
			if (person instanceof Director) {
				directorList.add((Director) person);
			}
		}
		return directorList;
	}

	public void addPerson(Scanner scan) {
		System.out.println("============== 人事追加 ==============");
		ArrayList<Employee> list = this.objPersonList.input(scan);
		for (Employee employee : list) {
			assignOnePerson(scan, employee);
		}
	}

	/*
	 * 削除作業関連関数
	 */
	public boolean deletePerson(Scanner scan) {
		boolean deleted = false;
		System.out.println("============== 人事削除 ==============");
		System.out.println("削除する人の番号を入力してください");
		String deleteID = scan.nextLine();
		Person person = searchPersonById(deleteID);
		if (person != null) {

			if (person instanceof Director) {// 部長削除
				deleteDirector((Director) person);
			} else if (person instanceof Employee) {// 平社員削除

			} else {// 社長削除

			}
		} else {
			System.out.println("入力した番号が見つからない");
		}
		
		return deleted;
	}

	public Person searchPersonById(String ID) {
		Person person = null;
		for (Person _person : this.objPersonList.getPersonList()) {
			if (_person.getId().equalsIgnoreCase(ID)) {
				person = _person;
				break;
			}
		}
		return person;
	}
	
	public boolean deleteDirector(Director director) {
		boolean deleted = false;
		for(Person person: this.objPersonList.getPersonList()) {
			if(person instanceof Employee) {
				Director directorOfEmployee = ((Employee) person).getDirector();
				if(directorOfEmployee != null) {
					if(director.getId().equalsIgnoreCase(directorOfEmployee.getId())) {
						((Employee) person).setDirector(null);
						this.objPersonList.getPersonList().remove(director);
						deleted = true;
					}
				}
			}
		}
		return deleted;
	}
}
