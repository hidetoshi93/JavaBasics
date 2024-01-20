/*
 * �쐬�l�F
 * �쐬���F
 * �ړI�F�@�e�N���X�̍�ƊǗ�
 * �o�[�W�����F
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
		System.out.println("************��Џ�����****************");
		System.out.print("��Ж�: ");
		this.companyName = scan.nextLine();

		System.out.print("�ŗ��ԍ�: ");
		this.taxId = scan.nextLine();

		System.out.print("����: ");
		this.monthOfProceeds = Float.parseFloat(scan.nextLine());
	}

	public void output() {
		System.out.println(
				"**********************************************************��Џ��**********************************************************");
		System.out.println("��Ж�: " + this.companyName);
		System.out.println("�ŗ��ԍ�: " + this.taxId);
		System.out.println("����: " + this.monthOfProceeds);
		System.out.println(
				"***************************************************************************************************************************");
		this.objPersonList.output();
	}

	// 5. Business methods
	public void salaryCalculate() {
		this.objPersonList.salaryCalculate();
	}

	public void dummyDataCompany() {
		this.companyName = "�W�F�[�@�G�[���@�A�C�@�������";
		this.taxId = "JP999999ND";
		this.monthOfProceeds = 435344f;
	}

	public void dummyDataPerson() {
		Person person = new Person();
		person = new Employee("1", "�O���A���Y", "098032", 20);
		objPersonList.add(person);
		person = new Employee("2", "�g��O", "098132", 23);
		objPersonList.add(person);
		person = new Employee("3", "�J�[", "098232", 31);
		objPersonList.add(person);
		person = new Employee("4", "�u������", "098332", 25);
		objPersonList.add(person);
		person = new Employee("5", "���ԕq�O", "098432", 23);
		objPersonList.add(person);
		person = new Employee("6", "����N", "098532", 31);
		objPersonList.add(person);

		person = new Director("7", "��؁@����", "0989898", 24);
		objPersonList.add(person);
		person = new Director("8", "�R�@����", "0989898", 24);
		objPersonList.add(person);
		person = new Director("9", "����@����", "0989898", 24);
		objPersonList.add(person);

		person = new President("10", "�L�c�͕v�@�В�", "0989898", 19, 80);
		objPersonList.add(person);

		person = new President("11", "��a�v�@�В�", "0989898", 21, 20);
		objPersonList.add(person);
	}

	public void assignEmployee() {
		for (Person person : objPersonList.getPersonList()) {
			if (person instanceof Employee) {
				Scanner scan = new Scanner(System.in);
				System.out.println("�z������Ă���]�ƈ�");
				person.output();
				assignOnePerson(scan, person);
			}
		}
	}

	private void assignOnePerson(Scanner scan, Person person) {
		showIDAndNameDirector();
		boolean flag = true;
		do {
			System.out.println("�z������ꍇ�� 1 ���A���Ȃ��ꍇ�� 2 ��I��ł�������");
			int selected = Integer.parseInt(scan.nextLine());
			if (selected == 1 || selected == 2) {
				if (selected == 1) {
					Director director = selectDirector(scan);
					((Employee) person).setDirector(director);
					director.add();
				}
				flag = false;
			} else {
				System.out.println("1����2��I��ł�������");
				flag = false;
			}
		} while (flag);
	}

	private Director selectDirector(Scanner scan) {
		Director director = null;
		do {
			System.out.println("��L�̕���ID����͂��Ă�������");
			String selectedID = scan.nextLine();
			director = searchDirector(selectedID);
		} while (director == null);

		return director;
	}

	private void showIDAndNameDirector() {
		System.out.println(
				"**********************************************************�������X�g**********************************************************");
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
		System.out.println("============== �l���ǉ� ==============");
		ArrayList<Employee> list = this.objPersonList.input(scan);
		for (Employee employee : list) {
			assignOnePerson(scan, employee);
		}
	}

	/*
	 * �폜��Ɗ֘A�֐�
	 */
	public boolean deletePerson(Scanner scan) {
		boolean deleted = false;
		System.out.println("============== �l���폜 ==============");
		System.out.println("�폜����l�̔ԍ�����͂��Ă�������");
		String deleteID = scan.nextLine();
		Person person = searchPersonById(deleteID);
		if (person != null) {

			if (person instanceof Director) {// �����폜
				deleteDirector((Director) person);
			} else if (person instanceof Employee) {// ���Ј��폜

			} else {// �В��폜

			}
		} else {
			System.out.println("���͂����ԍ���������Ȃ�");
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
